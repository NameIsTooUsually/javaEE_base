package com.chenhao.test;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test6 {
    public static void main(String[] args) {
        //创建一个线程池（不指定线程数量）
        /*ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"执行了");
        });
        executorService.shutdown();*/

        //创建一个指定最大数量的线程池

        MyRunnable r = new MyRunnable();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.submit(r);
        }
        executorService.shutdown();
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"正在执行任务"+i);
        }
    }
}
