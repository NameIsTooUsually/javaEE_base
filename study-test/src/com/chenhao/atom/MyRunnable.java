package com.chenhao.atom;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable implements Runnable{
    AtomicInteger a = new AtomicInteger(0);//冰淇淋的数量

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //给冰淇淋的数量加一
            int count = a.incrementAndGet();
            System.out.println("增加"+count+"个冰激凌");
        }
    }
}
