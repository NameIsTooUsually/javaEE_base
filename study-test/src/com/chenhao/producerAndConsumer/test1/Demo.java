package com.chenhao.producerAndConsumer.test1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        //创建生产者消费者对象

        Producer p = new Producer();
        Consumer c = new Consumer();
        //创建线程池
        ThreadPoolExecutor t =
                new ThreadPoolExecutor(
                        1,
                        2,
                        10,
                        TimeUnit.SECONDS, new ArrayBlockingQueue<>(0),
                        Executors.defaultThreadFactory(),
                        new ThreadPoolExecutor.AbortPolicy());
        t.submit(p);
        t.submit(c);
        t.shutdown();

        /*Thread t = new Thread(p);
        Thread t1 = new Thread(c);
        t.start();
        t1.start();*/
    }

}
