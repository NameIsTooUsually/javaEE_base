package com.chenhao.test.threaddemo3;

public class MyRunnable implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while(true){
        if("窗口一".equals(Thread.currentThread().getName())){
            boolean result = synchronizedMethod();
            if(result){
                break;
            }
        }
        if("窗口二一".equals(Thread.currentThread().getName())){
            if(ticket==0){
                break;
            }else{
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket--;
                System.out.println(Thread.currentThread().getName()+"在买票还剩"+ticket+"张");
            }
        }
        }
    }

    private synchronized boolean synchronizedMethod() {
        if(ticket==0){
            return true;
        }else{
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName()+"在买票还剩"+ticket+"张");
            return false;
        }
    }
}
