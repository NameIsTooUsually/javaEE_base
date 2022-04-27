package com.chenhao.test.threaddemo4;

public class LockDemo {
    public static void main(String[] args) {
        MyRunnableLock my = new MyRunnableLock();
        Thread t = new Thread(my);
        Thread t2 = new Thread(my);

        t.setName("窗口一");
        t2.setName("窗口二");

        t.start();
        t2.start();
    }
}
