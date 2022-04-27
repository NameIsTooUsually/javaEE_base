package com.chenhao.homework;

import java.util.ArrayList;
import java.util.List;

/*
定义main()方法，按以下顺序编写程序：
l 定义集合`List<String>`，添加以下数据：
​			"张三丰"
​			"王思聪"
​			"张飞"
​			"刘晓敏"
​			"张靓颖"
l 使用Stream流的filter()方法筛选集合中所有的"张"姓学员；
筛选后，使用forEach()方法打印筛选结果。
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰","王思聪","张飞","刘晓敏","张靓颖"));
        //创建Stream 流
        //调用filter方法进行筛选
        //调用foreach方法进行终结并打印
        list.stream().filter(str->{return str.startsWith("张");} ).forEach(str-> System.out.println(str));
    }
}
