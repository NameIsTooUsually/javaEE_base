package com.chenhao.collection;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        System.out.println("----------------");
       /* list.add(3,"333");
        System.out.println(list);*/
       /* list.remove(2);
        System.out.println(list);*/
       /*list.set(2,"222");
        System.out.println(list);*/
        System.out.println(list.get(2));


    }
}
