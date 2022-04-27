package com.chenhao.homework;

import java.util.Iterator;
import java.util.TreeSet;

/*
  请按以下要求顺序编码：
Ø  定义一个可以存储“整数”的TreeSet对象
Ø  存储以下整数
30,20,50,10,30,20
Ø  打印集合大小。为什么跟存入的数量不一致？
Ø  遍历集合，打印大于25的元素
 */
public class HomeWork4 {
    public static void main(String[] args) {
        TreeSet<Integer> intArr = new TreeSet<>();
        intArr.add(30);
        intArr.add(20);
        intArr.add(50);
        intArr.add(30);
        intArr.add(20);

        System.out.println("集合的数量："+intArr.size());
        System.out.println("因为TreeSet属于Set的实现类，Set集合主要特有的特点是元素不可重复");
        //创建迭代器对象
        Iterator<Integer> iterator = intArr.iterator();
        //使用迭代器进行遍历
        while(iterator.hasNext()){
            Integer temp = iterator.next();
            if(temp>25){
                System.out.println(temp);
            }
        }
    }
}
