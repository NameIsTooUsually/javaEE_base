package com.chenhao.homework.Test2;

public class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        //遍历1--1000所有的数字
        for (int i = 1; i <= 1000; i++) {
            System.out.println("i:"+i);
        }
    }
}
