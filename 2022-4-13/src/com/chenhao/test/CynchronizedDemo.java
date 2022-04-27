package com.chenhao.test;

public class CynchronizedDemo {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        my2.start();
        my1.start();
        my.start();

    }
}

class MyThread extends Thread {
    private static  int ticket = 100;
    private static final Object block = new Object();

    @Override
    public void run() {

           /* synchronized (block) {
                if (ticket > 0) {
                    ticket --;
                    System.out.println(Thread.currentThread().getName() + "正在卖票，还剩" + ticket + "张");
                } else {
                    break;
                }
            }*/
        while (true) {

            if(sellTicket()){
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static synchronized boolean sellTicket() {

        if (ticket == 0) {
            return true;
        }else{
            ticket--;
            System.out.println(Thread.currentThread().getName() + "正在卖票，还剩" + ticket + "张");

        }
        return false;

    }
}
