package com.chenhao.homework.Test2;


/*
请使用实现Runnable接口的方式定义一个类，在run()方法中使用循环变量i遍历1--1000所有的数字。
定义main()方法，启动这个线程，然后再使用循环变量k遍历1--1000所有的数字。
请观察控制台打印，i和k交叉打印的情况。
 */
public class Test2 {
    public static void main(String[] args) {
        //创建Myrunnable1对象
        MyRunnable1 mr = new MyRunnable1();
        //创建Thread对象,传入MyRunnable1对象
        Thread t = new Thread(mr);
        //开启线程
        t.start();
        //创建循环
        for (int j = 1; j <= 1000; j++) {
            System.out.println("j:"+j);
        }
    }

}
