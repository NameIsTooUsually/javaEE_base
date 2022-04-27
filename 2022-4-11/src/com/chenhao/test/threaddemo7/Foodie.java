package com.chenhao.test.threaddemo7;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie implements Runnable {
    private ArrayBlockingQueue<String> blockingQueue;

    public Foodie() {
    }
    public Foodie(ArrayBlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        //吃货不停吃汉堡
        while (true){
            try {
                blockingQueue.take();
                System.out.println("吃货吃了一个汉堡");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
