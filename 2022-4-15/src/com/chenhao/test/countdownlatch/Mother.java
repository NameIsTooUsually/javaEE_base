package com.chenhao.test.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Mother extends Thread {
    private CountDownLatch countDownLatch;
    public Mother(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            //等待孩子吃完饺子
            countDownLatch.await();
            //收拾碗筷
            System.out.println("妈妈在收拾孩子");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
