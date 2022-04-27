package com.chenhao.test.threaddemo;

public class Demo2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t = new Thread(mr);
        Thread t1 = new Thread(mr);
        t.start();
        t1.start();
    }
}
