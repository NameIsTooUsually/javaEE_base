package com.chenhao.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("你好");
        hs.add("二狗子");
        hs.add("中午");
        hs.add("吃什么");
        System.out.println(hs);

        Iterator<String> iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
