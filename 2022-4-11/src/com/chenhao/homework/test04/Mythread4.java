package com.chenhao.homework.test04;

public class Mythread4 extends Thread{
    @Override
    public void run() {
        //线程计算1-1000的累加和
        //定义个累加的容器，初始值为0
        int sum = 0;
        //循环遍历并累加
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        //输出打印
        System.out.println(Thread.currentThread().getName() + "线程计算1-1000的累加和，结果：" + sum);
    }
}
