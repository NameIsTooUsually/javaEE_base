package com.chenhao.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {


    public static void main(String[] args) {
        /*Collection<String> list =  new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");
        list.add("f");
        System.out.println(list.size());
        Iterator<String> iterator = list.iterator();
         while(iterator.hasNext()){
             System.out.print(iterator.next());
         }*/
        /*int[] arr = {0, 1, 2, 3, 4, 5};
        int count = arr[0];
        int i = count;

        count = i + 1;
        System.out.println(i);*/
        int[] arr = {0, 1, 2, 3, 4, 5};
        for(int i:arr){
            System.out.println(i);
        }
    }
}
