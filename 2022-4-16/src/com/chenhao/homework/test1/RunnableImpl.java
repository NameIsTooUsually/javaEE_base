package com.chenhao.homework.test1;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("我需要一个老师");
        try {
            System.out.println(Thread.currentThread().getName()+"正在指导我");
            Thread.sleep(2000);
            System.out.println("教我java,教完后，老师回到了办公室");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
