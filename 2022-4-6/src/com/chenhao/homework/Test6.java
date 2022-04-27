package com.chenhao.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
定义main()方法，按以下顺序编写程序：
l 定义集合`List<String>`，添加以下数据：
​	        "王佳乐"
​			"张三丰"
​			"王思聪"
​			"张飞"
​			"刘晓敏"
​			"张靓颖"
​			"王敏"
l 先筛选出所有的"张"姓学员；
l 再筛选出所有的"王"姓学员；
l 将两个流合并为一个流
l 打印合并后的每个元素。
 */
public class Test6 {
    public static void main(String[] args) {
        //创建一个集合 ArrayList
        ArrayList<String> arrayList = new ArrayList<>(List.of("王佳乐","张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏"));
        //使用Stream流的filter()方法筛选集合中所有的"张"姓学员；
        Stream<String> stream1 = arrayList.stream().filter(str -> { return str.startsWith("张"); });
        //使用Stream流的filter()方法筛选集合中所有的"王"姓学员；
        Stream<String> stream2 = arrayList.stream().filter(str -> { return str.startsWith("王"); });
        //将两个流合并为一个流,打印合并后的每个元素。
        Stream.concat(stream1,stream2).forEach(str-> System.out.println(str));

    }
}
