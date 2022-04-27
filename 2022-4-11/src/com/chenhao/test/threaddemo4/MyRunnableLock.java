package com.chenhao.test.threaddemo4;

import java.util.concurrent.locks.ReentrantLock;

public class MyRunnableLock implements Runnable {
    private int ticket = 100;
    ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {


        while (true) {
            try {
                lock.lock();
                if (ticket <= 0) {
                    break;
                } else {
                    Thread.sleep(1);
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "在卖票，还剩" + ticket + "张");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
