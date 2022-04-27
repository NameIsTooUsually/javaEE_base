package com.chenhao.test.threaddemo;

public class Demo1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyThread mt1 = new MyThread();
        mt.start();
        mt1.start();

    }
}
