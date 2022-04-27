package com.chenhao.homework.test3;
/*
请使用继承Thread类的方式定义一个线程类，在run()方法中循环10次，每1秒循环1次，
每次循环按“yyyy-MM-dd HH:mm:ss”的格式打印当前系统时间。
请定义测试类，并定义main()方法，启动此线程，观察控制台打印。
 */
public class Test3 {
    public static void main(String[] args) {
        //创建线程对象
        Mythread2 mt = new Mythread2();
        //开启线程
        mt.start();
    }
}
