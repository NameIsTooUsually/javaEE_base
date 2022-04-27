package com.chenhao.test;
//非默认拒绝策略

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Test7 {
    public static void main(String[] args) throws InterruptedException {
        //创建一个线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                                        2,
                                        5,
                                        5L, TimeUnit.SECONDS,
                                        new ArrayBlockingQueue<>(5),
                                        Executors.defaultThreadFactory()
        );
        //pool.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        //pool.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        pool.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
        //pool.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        System.out.println("线程池当前线程个数"+pool.getPoolSize());
        for (int i = 1; i <= 11; i++) {
            //Thread.sleep(50);
            pool.submit(new RunnableImpl(i));
        }
        System.out.println("线程池当前线程个数"+pool.getPoolSize());
        Thread.sleep(10000);
        System.out.println("线程池当前线程个数"+pool.getPoolSize());
        pool.shutdown();
    }
}
class RunnableImpl implements Runnable{
        int i ;

    public RunnableImpl(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"在执行任务"+i);
    }
}
