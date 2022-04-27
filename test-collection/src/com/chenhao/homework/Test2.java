package com.chenhao.homework;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

/*
请定义一个Collection类型的集合，存储以下分数信息：
​              88.5,39.2,77.1,56.8,89,99,59.5
   请编程实现以下功能：
Ø  使用增强for遍历所有元素，并打印
Ø  使用增强for遍历所有元素，打印不及格的分数；
Ø  使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
Ø  使用增强for遍历所有元素，求出最高分，并打印；
(注意：以上所有功能写在一个main()方法中，但请单独实现)
 */
public class Test2 {
    public static void main(String[] args) {
        Collection<Double> listDouble = new ArrayList<>();
        listDouble.add(88.5);
        listDouble.add(39.2);
        listDouble.add(77.1);
        listDouble.add(56.8);
        listDouble.add(89D);
        listDouble.add(99D);
        listDouble.add(59.5);

        //method1(listDouble);
        //method2(listDouble);
        //method3(listDouble);
        //method4(listDouble);


    }
//Ø  使用增强for遍历所有元素，求出最高分，并打印；
    public static void method4(Collection<Double> listDouble) {
        double max = ((ArrayList<Double>) listDouble).get(0);
        for (Double d : listDouble) {
            if(max<d){
                max = d;
            }
        }
        System.out.println("最高分为："+max);
    }

    //Ø  使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
    public static void method3(Collection<Double> listDouble) {
        int count = 0;
        double sum = 0;
        for (Double d : listDouble) {
            if(d<60){
                count++;
                sum+=d;
            }
        }

        BigDecimal totalScore = new BigDecimal(sum+"");
        BigDecimal result = totalScore.divide(new BigDecimal(count), 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("不及格分数的数量为："+count);
        System.out.println("不及格的平均分为："+result);
    }

    //Ø  使用增强for遍历所有元素，打印不及格的分数；
    public static void method2(Collection<Double> listDouble) {
        for (Double d : listDouble) {
            if(d<60){
                System.out.println(d);
            }
        }
    }

    //Ø  使用增强for遍历所有元素，并打印
    public static void method1(Collection<Double> listDouble) {
        for (Double d : listDouble) {
            System.out.println(d);
        }
    }
}
