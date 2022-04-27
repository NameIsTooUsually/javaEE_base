package com.chenhao.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
​       请定义一个可以存储“整数”的集合，并存储一些数据。
​              请按以下要求顺序编程实现：
Ø  对集合中的数据打乱顺序；（**自学，查询API文档找到对应的方法实现**）
Ø  打印集合
Ø  对集合中的数据进行升序排序
Ø  打印集合
Ø  对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
Ø  打印集合
 */
public class HomeWork1 {
    public static void main(String[] args) {
        //定义一个可以存储整数的集合
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(10);
        intArr.add(7);
        intArr.add(15);
        intArr.add(3);
        intArr.add(8);
        intArr.add(4);
        intArr.add(27);
        //method1(intArr);
        //method2(intArr);
        //method3(intArr);


    }

    public static void method3(ArrayList<Integer> intArr) {
        System.out.println(intArr);
        //对集合进行倒序排序，用冒泡排序思想
        //外层For控制循环排序的次数。
        for (int i = 0; i <intArr.size()-1 ; i++) {
            //内层for控制每次循环交换的次数
            for (int j = 0; j < intArr.size()-1-i; j++) {
                if(intArr.get(j)<intArr.get(j+1)){
                    Integer temp = intArr.get(j);
                    intArr.set(j,intArr.get(j+1));
                    intArr.set(j+1,temp);
                }
            }
        }
        System.out.println(intArr);
    }

    //Ø  对集合中的数据进行升序排序
    public static void method2(ArrayList<Integer> intArr) {
        System.out.println(intArr);
        //将集合转换成Integer类型的数组
        Integer[] newIntArr = intArr.toArray(new Integer[intArr.size()]);
        //使用数组中的排序方法进行升序排序
        Arrays.sort(newIntArr);
        System.out.print("[");
        for (int i = 0; i < newIntArr.length; i++) {
            if(newIntArr.length-1==i){
                System.out.println(newIntArr[i]+"]");
            }else{
                System.out.print(newIntArr[i]+" ,");
            }
        }
    }
//Ø  对集合中的数据打乱顺序；（**自学，查询API文档找到对应的方法实现**）
    public static void method1(ArrayList<Integer> intArr) {
        //原集合打印
        System.out.println(intArr);
        Collections.shuffle(intArr);
        //随机后的集合打印
        System.out.println(intArr);
    }
}
