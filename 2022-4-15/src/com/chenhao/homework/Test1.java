package com.chenhao.homework;

import java.util.concurrent.Semaphore;

/*
请使用Semaphore编写一个程序，实现以下效果：有10名游客要参观展览室
而“展览室”同时只允许最多“三个游客”参观，每个游客参观时间2秒。
#### 训练目标
Semaphore
 */
public class Test1 {
    public static void main(String[] args) {
    //创建任务对象
        MyRunnable mr = new MyRunnable();
        //创建是个线程
        for (int i = 0; i < 10; i++) {
            new Thread(mr).start();
        }
    }
}
//创建一个Runnable实现类
class MyRunnable implements Runnable{
//创建Semaphore对象,允许三个线程同时持有通行证
    Semaphore semaphore = new Semaphore(3);
    @Override
    public void run() {
        try {
            //获得通行证
            semaphore.acquire();
            //开始参观
            System.out.println(Thread.currentThread().getName()+"正在参观");
            //参观两秒
            Thread.sleep(2000);
            //参观完成
            System.out.println(Thread.currentThread().getName()+"参观完成了");

            //参观结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            //归还通行证
            semaphore.release();
        }
    }
}
