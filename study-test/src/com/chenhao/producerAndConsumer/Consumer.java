package com.chenhao.producerAndConsumer;

public class Consumer implements Runnable {

    @Override
    public void run() {
        while(true){
            synchronized (Desk.o) {
                if(Desk.count>=10){
                    break;
                }
                if(Desk.isFood){
                    //此时是有食物的，那消费者就开始吃
                    Desk.isFood = false;
                    Desk.count++;
                    System.out.println("消费者开始吃食物");
                    Desk.o.notify();
                }else{
                    //此时没有食物，消费者需要等待生产者唤醒
                    try {
                        Desk.o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
