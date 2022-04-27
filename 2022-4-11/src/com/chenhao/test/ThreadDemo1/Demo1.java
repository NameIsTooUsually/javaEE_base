package com.chenhao.test.ThreadDemo1;

public class Demo1 {
    public static void main(String[] args) {
        Mythread mt = new Mythread();
        mt.setName("二狗子的表白计划");
        Mythread mt1 = new Mythread("二愣子的飞机次数");
        mt.start();
        mt1.start();
    }
}
