package com.chenhao.test;

import java.util.concurrent.atomic.AtomicInteger;

public class Test5 {
    public static void main(String[] args) {
        Atom a = new Atom();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(a);
            thread.start();
        }
    }
}
class Atom implements Runnable{
    private AtomicInteger count = new AtomicInteger(0);
    private Object lock = new Object();
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

                count.incrementAndGet();
                System.out.println("已经送了"+count.get()+"个冰激凌");

        }
    }

}