package com.chenhao.linklist;

import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("aaa");
        linkedList.add("bbb");
        linkedList.add("ccc");
        linkedList.add("ddd");
        System.out.println(linkedList);
        System.out.println("-------------------------");
       /* linkedList.addFirst("111");
        linkedList.addLast("000");*/

  /*     linkedList.removeFirst();
        linkedList.removeLast();*/

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
        System.out.println("-------------------------");


    }
}
