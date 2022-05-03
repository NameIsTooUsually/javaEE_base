package com.chenhao.producerAndConsumer.test1;

public class Producer implements Runnable{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.o) {
                if(Desk.count>=10){
                    break;
                }
                if(Desk.isFood){
                    //此时是有食物的，那生产者不需要生产，开始等待
                    try {
                        Desk.o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    //此时没有食物，生产者需要生产
                    Desk.isFood = true;
                    System.out.println("生产者制作了食物");
                    Desk.o.notify();
                }
            }
        }
    }
}
