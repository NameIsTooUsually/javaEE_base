package com.chenhao.test.threaddemo5;

public class Demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t = new Thread(mr);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+"执行了"+i);
                }
            }
        });
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        t.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
