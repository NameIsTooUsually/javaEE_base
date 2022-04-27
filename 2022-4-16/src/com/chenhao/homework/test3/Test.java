package com.chenhao.homework.test3;

import java.util.concurrent.CountDownLatch;

/*
请使用CountDownLatch编写一个程序，实现以下效果：
    线程A打印：”开始计算”
​	线程B：计算1--100所有数的累加和，并打印结果。
​	线程A打印：”计算完毕”
 */
public class Test {
    public static void main(String[] args) {
        //创建门锁对象，将需要等待的数量设置为1
        CountDownLatch latch = new CountDownLatch(1);

        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"开始计算");
            try {
                //开始等待，等计数到0；
                latch.await();
                System.out.println(Thread.currentThread().getName()+"计算完毕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        //设置线程名称
        t1.setName("A");
        //开启线程
        t1.start();

        Thread t2 = new Thread(()->{
            int sum=0;
            for (int i = 1; i <= 100; i++) {
                sum+=i;
            }
            System.out.println(Thread.currentThread().getName()+"结果为"+sum);
            //线程完成操作，将计数减一。
            latch.countDown();
        });
        t2.setName("B");
        t2.start();
    }
}
