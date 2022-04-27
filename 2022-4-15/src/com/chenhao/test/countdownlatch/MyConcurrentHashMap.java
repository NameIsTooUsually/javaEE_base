package com.chenhao.test.countdownlatch;

import java.util.ConcurrentModificationException;
import java.util.concurrent.ConcurrentHashMap;

public class MyConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        //创建一个concurrentHashMap对象
        ConcurrentHashMap<String,String> mchm = new ConcurrentHashMap<>();

        Thread t = new Thread(()->{
            for (int i = 0; i < 25; i++) {
                mchm.put(i+"",i+"");
            }
        });
        Thread t1 = new Thread(()->{
            for (int i = 25; i < 51; i++) {
                mchm.put(i+"",i+"");
            }
        });

        t.start();
        t1.start();
        System.out.println("----------------------");
        Thread.sleep(1000);

        for (int i = 0; i < 51; i++) {
            System.out.println(mchm.get(i+""));
        }
    }
}
