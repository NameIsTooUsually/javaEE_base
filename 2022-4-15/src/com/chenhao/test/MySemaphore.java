package com.chenhao.test;

import java.util.HashMap;
import java.util.concurrent.Semaphore;

public class MySemaphore implements Runnable {
    //创建Semaphore对象
    Semaphore s = new Semaphore(2);
    @Override
    public void run() {
        try {
            //获得通行证
            s.acquire();
            //开始同行
            System.out.println(Thread.currentThread().getName()+"大家坐好，我在开车了");
            //归还通行证
            System.out.println(Thread.currentThread().getName()+"开车被抓了");
            s.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Demo{
    public static void main(String[] args) {
        MySemaphore ms = new MySemaphore();
        for (int i = 0; i < 100; i++) {
            new Thread(ms).start();
        }

    }
}
