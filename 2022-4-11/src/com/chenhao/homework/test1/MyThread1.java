package com.chenhao.homework.test1;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        //遍历并打印数组
        for (int i = 1; i <= 1000; i++) {
            System.out.println("i:"+i);
        }
    }
}
