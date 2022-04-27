package com.chenhao.test.threaddemo7;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker implements Runnable {
    private ArrayBlockingQueue<String> blockingQueue;

    public Cooker() {
    }

    public Cooker(ArrayBlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        //厨师不停做汉堡
       while (true){
           try {
               blockingQueue.put("一个汉堡");
               System.out.println("厨师做了一个汉堡");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
