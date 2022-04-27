package com.chenhao.homework;
//请使用“匿名Runnable”子类的方式实现线程，线程中计算1--500所有数字的累加和，并打印计算结果
public class Test6 {
    public static void main(String[] args) {
        //使用
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //定义一个累加的容器
                int sum =0;
                //使用循环累加并求和
                for (int i = 0; i < 500; i++) {
                    sum+=i;
                }
                //打印累加的结果
                System.out.println(Thread.currentThread().getName()+"计算1-500的累加和，结果："+sum);
            }
        });
        //开启线程
        t.start();
    }
}
