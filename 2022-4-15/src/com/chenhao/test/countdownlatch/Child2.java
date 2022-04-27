package com.chenhao.test.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Child2 extends Thread{
    private CountDownLatch countDownLatch;
    public Child2(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        //1吃饺子
        for (int i = 1; i <= 19; i++) {
            System.out.println(getName()+"在吃"+i+"个饺子");
        }
        //喊一声吃完了

            countDownLatch.countDown();

    }
}
