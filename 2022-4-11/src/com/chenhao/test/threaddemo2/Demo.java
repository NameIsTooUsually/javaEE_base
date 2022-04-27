package com.chenhao.test.threaddemo2;

public class Demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        MyRunnable mr1 = new MyRunnable();
        Thread t = new Thread(mr);
        Thread t1 = new Thread(mr);

        t.start();
        t1.start();
    }
}
