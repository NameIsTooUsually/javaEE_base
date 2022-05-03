package com.chenhao.atom;

import java.io.File;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();
       // System.out.println(runnable.a);
        for (int i = 0; i < 100; i++) {
            new Thread(runnable).start();
        }
       /* Thread.sleep(10000);
        System.out.println(runnable.a);*/
        File f = new File("com.chenhao.atom.MyRunnable");

    }
}
