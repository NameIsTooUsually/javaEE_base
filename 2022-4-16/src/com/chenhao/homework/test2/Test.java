package com.chenhao.homework.test2;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
请使用ConcurrentHashMap定义一个线程安全的Map，使用两个线程访问它：
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, String> chm = new ConcurrentHashMap();
        new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                chm.put(i + "", i + "");
            }

        }).start();

        new Thread(() -> {
            for (int i = 21; i <= 40; i++) {
                chm.put(i + "", i + "");
            }

        }).start();
        //Thread.sleep(1000);
        Set<Map.Entry<String, String>> entries = chm.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"=========>"+entry.getValue());
        }
    }
}


