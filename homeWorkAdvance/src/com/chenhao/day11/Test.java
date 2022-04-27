package com.chenhao.day11;

import java.util.Random;

/*
开启一个线程执行任务：随机获得10个100到1000的整数并将10个整数相加求和，
将求和结果输出。
 */
public class Test {
    public static void main(String[] args) {
        //使用匿名内部类重写Thread类中run方法
        new Thread() {
            @Override
            public void run() {
                //创建随机数对象
                Random r = new Random();
                //创建一个数组用来存储随机数
                int[] arr = new int[10];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = r.nextInt(900) + 100;
                }
                //遍历数组将元素相加
                //创建一个变量来存储相加的值
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum+=arr[i];
                }
                System.out.println("结果为:"+sum);
            }
        }.start();
    }
}
