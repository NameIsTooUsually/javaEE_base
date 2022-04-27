package com.chenhao.homework;

import java.util.ArrayList;
import java.util.HashSet;

/*
ArrayList有以下元素: "a","f","b","c","a","d"，请用任意方式完成集合元素去重。
去除集合中重复的元素。
 */
public class Test5 {
    public static void main(String[] args) {
        //先定义一个ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("f");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("a");
        arrayList.add("d");

        //再定义一个HashSet集合。遍历ArrayList，将元素拿出来存入HashSet中
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < arrayList.size(); i++) {
            String temp = arrayList.get(i);
            hashSet.add(temp);
        }
        //此时直接打印也可展示去重效果。

        arrayList.clear();
        for (String s : hashSet) {
            arrayList.add(s);

        }
        System.out.println(arrayList);


    }
}
