package com.chenhao.homework;
/*
请使用“匿名Thread”子类的方式实现线程，线程中计算1--100所有数字的累加和，并打印计算结果。
 */
public class Test5 {
    public static void main(String[] args) {
        //使用匿名内部类创建一个线程对象,计算1-100的累加和
        new Thread(){
            @Override
            public void run() {
                //计算1-100所有数组的累加
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum+=i;
                }
                System.out.println(Thread.currentThread().getName()+"线程计算1-100的累加和，结果："+sum);
            }
        }.start();
        /*//使用匿名内部类创建一个线程对象,计算1-1000的累加和
        new Thread(){
            @Override
            public void run() {
                //计算1-100所有数组的累加
                int sum = 0;
                for (int i = 1; i <= 1000; i++) {
                    sum+=i;
                }
                System.out.println(Thread.currentThread().getName()+"线程计算1-1000的累加和，结果："+sum);
            }
        }.start();*/
    }
}
