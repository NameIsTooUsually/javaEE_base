package com.chenhao.homework;

import java.util.ArrayList;
import java.util.List;

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
l 使用Stream流的filter()方法筛选集合中所有的"张"姓学员；
l 筛选后，获取前两个，并打印。
l 重新获取Stream流，用filter()方法筛选出所有的"王"姓学员；
l 筛选后，跳过前1个，打印剩余的人员。
 */
public class Test5 {
    public static void main(String[] args) {
        //创建一个集合 ArrayList
        ArrayList<String> arrayList = new ArrayList<>(List.of("王佳乐","张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏"));
        //使用Stream流的filter()方法筛选集合中所有的"张"姓学员；
        //获取前两个并打印
        arrayList.stream().filter(str->{return str.startsWith("张");}).limit(2).forEach(str-> System.out.println(str));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        //重新获取Stream流，用filter()方法筛选出所有的"王"姓学员；
        //筛选后，跳过前1个
        arrayList.stream().filter(str->{return str.startsWith("王");}).skip(1).forEach(str-> System.out.println(str));
    }
}
