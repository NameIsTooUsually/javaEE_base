package com.chenhao.producerAndConsumer.test2;

import java.io.FileReader;

/*
测试生产者消费者模型
 */
public class Test {
    public static void main(String[] args) {
        //创建生产者对象
        Producer producer = new Producer();
        //创建消费者对象
        Consumer consumer = new Consumer();
        //创建两条线程
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        //开启线程
        t1.start();
        t2.start();

    }
}
