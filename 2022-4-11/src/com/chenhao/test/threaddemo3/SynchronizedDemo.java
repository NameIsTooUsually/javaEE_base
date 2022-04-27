package com.chenhao.test.threaddemo3;

public class SynchronizedDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        Thread t1 = new Thread(mr);
        t.setName("窗口一");
        t1.setName("窗口二");

        t.start();
        t1.start();
    }
}
