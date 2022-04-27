package com.chenhao.day14;

import java.util.ArrayList;
import java.util.Arrays;

/*
已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，请使用Stream：
1. 取出前2个元素并在控制台打印输出。
2. 取出后2个元素并在控制台打印输出。
 */
public class Test5 {
    public static void main(String[] args) {
        //创建数组
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("陈玄风","梅超风","陆乘风","曲灵风","武眠风","罗玉风"));
       //取出前2个元素并在控制台打印输出。
        //arrayList.stream().limit(2).forEach(s -> System.out.println(s));
        //取出后2个元素并在控制台打印输出。
        arrayList.stream().skip(4).forEach(s -> System.out.println(s));

    }
}
