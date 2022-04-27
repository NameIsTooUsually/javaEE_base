package com.chenhao.test;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

public class Test8 {
    public static void main(String[] args) {
        //创建对象
        MRa m = new MRa();

        //创建三个线程对象
        Thread t1 = new Thread(m,"窗口一");
        Thread t2 = new Thread(m,"窗口二");
        Thread t3 = new Thread(m,"窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}
class MRa implements Runnable{
        private  AtomicInteger ticket = new AtomicInteger(10);
        //private Object lock = new Object();
    @Override
    public void run() {
        while(true){
                if(ticket.get()<=0){
                    break;
                }else{
                    //int count = ticket.incrementAndGet();
                    /*int count = ticket.get()-1;
                    ticket.set(count);
                    System.out.println(Thread.currentThread().getName()+"正在卖票，还剩"+count+"张");*/
                    ticket.set(ticket.get()-1);
                    System.out.println(Thread.currentThread().getName()+"正在卖票，还剩"+ticket.get()+"张");
                }
        }
    }
}
