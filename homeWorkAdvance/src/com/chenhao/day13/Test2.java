package com.chenhao.day13;

import java.util.concurrent.Semaphore;

/*
请按要求编写多线程应用程序，模拟多个人通过一个山洞。要求：
1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。显示每次通过山洞人的姓名，和通过顺序。
 */
public class Test2 {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();
        for (int i = 0; i < 10; i++) {
            new Thread(task,i+"").start();
        }
    }
}
class MyRunnable implements Runnable{
    private int count = 1;
    Semaphore semaphore = new Semaphore(1);
    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+"正在经过山洞");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"第"+count+"个通过");
            count++;
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
