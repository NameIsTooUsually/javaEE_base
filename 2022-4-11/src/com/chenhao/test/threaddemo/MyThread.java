package com.chenhao.test.threaddemo;

public class MyThread extends Thread {
    @Override
    public void run() {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName()+"@@@"+i);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
