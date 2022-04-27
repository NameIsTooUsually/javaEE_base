package com.chenhao.test.threaddemo7;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        //创建第一个阻塞队列
        ArrayBlockingQueue<String> blockingQueue =new ArrayBlockingQueue<>(1);
        Cooker cooker = new Cooker(blockingQueue);
        Foodie foodie = new Foodie(blockingQueue);

        Thread t = new Thread(cooker);
        Thread t1 = new Thread(foodie);

        t.start();
        t1.start();
    }
}
