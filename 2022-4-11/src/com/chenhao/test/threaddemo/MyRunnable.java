package com.chenhao.test.threaddemo;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        long l = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            System.out.println("第二种方法实现多线程"+i);
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l);

    }
}
