package com.chenhao.test.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Demo {
    public static void main(String[] args) {
        //创建一个countdownlatch对象
        CountDownLatch countDownLatch = new CountDownLatch(3);
        //创建孩子线程和妈妈线程
        Mother m = new Mother(countDownLatch);
        m.start();
        Child1 c1 = new Child1(countDownLatch);
        c1.setName("小明");
        Child2 c2 = new Child2(countDownLatch);
        c2.setName("小红");
        Child3 c3 = new Child3(countDownLatch);
        c3.setName("小亮");

        c1.start();
        c2.start();
        c3.start();
    }
}
