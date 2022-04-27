package com.chenhao.homework;

import java.util.Iterator;
import java.util.TreeSet;

/*
 请编写main()方法，按以下要求顺序
Ø  定义一个TreeSet集合，并存储以下数据：
刘备，关羽，张飞，刘备，张飞
Ø  打印集合大小，为什么和存入的数量不一致
Ø  使用迭代器遍历集合，并打印每个元素
Ø  使用增强for遍历集合，并打印每个元素
 */
public class HomeWork2 {
    public static void main(String[] args) {
        //定义一个TreeSet集合
        TreeSet<String> someName = new TreeSet<>();
        someName.add("刘备");
        someName.add("关羽");
        someName.add("张飞");
        someName.add("刘备");
        someName.add("张飞");
        //Ø  打印集合大小，为什么和存入的数量不一致
        System.out.println("集合大小为："+someName.size());
        System.out.println("因为TreeSet属于Set的实现类，Set集合主要特有的特点是元素不可重复");
        System.out.println("---------------------");
        //Ø  使用迭代器遍历集合，并打印每个元素
        Iterator<String> iterator = someName.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("----------------------");
        //Ø  使用增强for遍历集合，并打印每个元素
        for (String s : someName) {
            System.out.print(s+" ");
        }
    }
}
