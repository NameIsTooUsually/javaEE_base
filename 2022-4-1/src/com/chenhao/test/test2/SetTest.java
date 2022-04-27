package com.chenhao.test.test2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("444");
        set.add("333");
        set.add("333");
        set.add("222");
        set.add("111");

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("-------------");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
