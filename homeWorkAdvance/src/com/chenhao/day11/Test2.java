package com.chenhao.day11;
/*
编写程序，创建两个线程对象，
一根线程输出“播放背景音乐”，另一根线程输出“显示画面”，
要求线程实现 Runnable接口，且使用匿名内部类实现。
 */
public class Test2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("播放背景音乐");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("显示画面");
            }
        });
        t1.start();
        t2.start();
    }
}
