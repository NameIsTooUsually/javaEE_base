package com.chenhao.apitest.homework;

import java.math.BigDecimal;

/*
有一个String[]数组如下：
String[] nums = {“3.22”,”8.1”,”7”,”2.5”,”3.1”,”7.77”,”8.0”,”9.21”};
请编程计算它们的平均值，结果精确到小数点后两位。
####
 */
public class Test2 {
    public static void main(String[] args) {

        //1先定义一个字符串数组。
        //2将数组中的字符串元素转换成bigDecimal类型。
        //由于需要操作数组中的所有元素，可以对数组进行遍历，并将其累加。
        //最后调用divide求平均值 并保留两位小数

        //1先定义一个字符串数组。
        String[] nums = {"3.22","8.1","7","2.5","3.1","7.77","8.0","9.21"};
        //定义一个BigDecimal类型变量来接收累加的数
        BigDecimal sum = new BigDecimal("0");

        //用for循环将nums中的元素转换成Bigdecimal类型，并累加
        for (int i = 0; i < nums.length; i++) {
            sum = sum.add(new BigDecimal(nums[i]));
        }
        //数组中元素的个数，将其转换成字符串类型，再转换成Bigdecimal类型；
        BigDecimal number = new BigDecimal((nums.length+""));
        //计算平均数
        BigDecimal ave = sum.divide(number,2,BigDecimal.ROUND_HALF_UP);//采用四舍五入的舍入模式
        System.out.println("平均值："+ave);

    }
}