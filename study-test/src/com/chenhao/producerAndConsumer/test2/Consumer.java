package com.chenhao.producerAndConsumer.test2;
/*
消费者
 */
public class Consumer implements Runnable{

    @Override
    public void run() {
        //消费者吃面包
        while (true){
            synchronized (Desk.lock) {
                if(0==Desk.count){
                    //此时消费者已经吃了是个汉堡了，退出循环，结束线程
                    break;
                }else{
                    //此时消费者还没有吃到10个汉堡，还需要继续
                    if(Desk.flag){
                        //桌子上有面包，消费者开始吃
                        Desk.count--;
                        Desk.flag = false;
                        System.out.println("消费者吃了一个汉堡");
                        //吃完后唤醒生产者继续生产
                        Desk.lock.notifyAll();
                    }else{
                        //此时桌上没有汉堡，消费者等待生产者生产
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
