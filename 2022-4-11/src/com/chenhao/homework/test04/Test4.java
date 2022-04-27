package com.chenhao.homework.test04;

/*
请使用继承Thread类的方式定义两个线程，一个线程可以计算1--100所有数字的累加和
另一个线程可以计算1--1000所有数字的累加和，每个线程计算完毕后各自打印计算结果，
格式例如：”xxx线程计算1--100的累加和，结果：xxxx”
请定义测试类，并定义main()方法，启动两个线程，观察控制台打印结果。
 */
public class Test4 {
    public static void main(String[] args) {
        //创建两个线程对象
        Mythread3 mt3 = new Mythread3();
        Mythread4 mt4 = new Mythread4();
        //启动两个线程
        mt3.start();
        mt4.start();
    }

}
