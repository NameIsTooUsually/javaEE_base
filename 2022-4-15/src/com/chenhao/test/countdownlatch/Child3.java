package com.chenhao.test.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Child3 extends Thread{
    private CountDownLatch countDownLatch;
    public Child3(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        //1吃饺子
        for (int i = 1; i <= 15; i++) {
            System.out.println(getName()+"在吃"+i+"个饺子");
        }
        //喊一声吃完了
        countDownLatch.countDown();
    }
}
