package com.chenhao.day12;
/*
有100个限量版的水杯，但是只能通过实体店和官网才能进行购买，并且分别统计卖了多少。
请用线程进行模拟并设置线程名称用来代表售出途径，再将信息打印出来。比如（实体店卖出第1个，总共剩余n个..）
 */
public class Test {
    public static void main(String[] args) {
        //创建任务对象
        MyRunnable task = new MyRunnable();
        //创建线程
        Thread t1 = new Thread(task,"实体店");
        Thread t2 = new Thread(task,"官网");
        //开启线程
        t1.start();
        t2.start();
    }
}
class MyRunnable implements Runnable{
    private static int count = 100;
    private static final Object lock = new Object();//synchronized 锁
    @Override
    public void run() {
        while(true){
            synchronized (lock) {
                if(count>0){
                    count--;
                    System.out.println(Thread.currentThread().getName()+"卖出第"+(100-count)+"个，总共剩余"+count+"个");
                }else{
                    break;
                }
            }
        }
    }
}
