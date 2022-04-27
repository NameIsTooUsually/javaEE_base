package com.chenhao.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
定义main()方法，按以下顺序编写程序：
l 定义集合`List<String>`，添加以下数据：
​			"张三丰"
​			"王思聪"
​			"张飞"
​			"刘晓敏"
​			"张靓颖"
l 使用Stream流的forEach()方法打印集合的所有元素
 */
public class Test2 {
    public static void main(String[] args) {
        //创建list集合
        //List<String> list = new ArrayList<>(List.of("张三丰","王思聪","张飞","刘晓敏","张靓颖"));
        List<String> list = new LinkedList<>(List.of("张三丰","王思聪","张飞","刘晓敏","张靓颖"));
        //创建Stream 流,并且调用foreach;
        list.stream().forEach(str-> System.out.println(str));
    }
}
