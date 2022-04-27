package com.chenhao.day08;

import java.util.ArrayList;

//需求：定义一个方法int  listTest(ArrayList<Integer> al, Integer s)，
// 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        for (int i = 10; i > 1; i--) {
            arrayList.add(i);
        }
        Integer s = 0;
        int index = listTest(arrayList, s);
       //打印索引
        System.out.println(index);
    }

    public static int listTest(ArrayList<Integer> arrayList, Integer s) {
        //假设s不存在
        int flag = -1;
        //循环遍历集合，
        for (int i = 0; i < arrayList.size(); i++) {
            //如果集合中元素等于s，将此时i的值赋给flag并结束循环
            if (arrayList.get(i)-s==0) {
                flag = i;
                break;
            }
        }
        //返回flag
        return flag;
    }
}

