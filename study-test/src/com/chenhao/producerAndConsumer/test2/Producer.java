package com.chenhao.producerAndConsumer.test2;
/*
生产者
 */
public class Producer implements Runnable{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock) {
                if(Desk.count==0){
                    //说明消费者已经吃完了10个汉堡，此时结束生产者线程
                    break;
                }else{
                    //判断座子上是否有汉堡，如果有就等待，如果没有就生产
                    if(!Desk.flag){
                        //此时没有汉堡，生产者开始生产
                        System.out.println("生产者生产了一个汉堡");
                        //生产好了 唤醒消费者来吃
                        Desk.flag = true;
                        Desk.lock.notifyAll();
                    }else{
                        //此时桌子上有面包，生产者不需要生产，进行等待
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
