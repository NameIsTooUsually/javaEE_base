package com.chenhao.linklist;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("aaa");
        linkedList.add("bbb");
        linkedList.add("ccc");
        linkedList.add("ddd");

        System.out.println("--------------------");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("--------------------");

        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------------------");

        for (String s : linkedList) {
            System.out.println(s);
        }

        System.out.println("---------------------");

    }
}
