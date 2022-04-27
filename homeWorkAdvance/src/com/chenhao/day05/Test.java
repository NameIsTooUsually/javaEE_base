package com.chenhao.day05;

import java.math.BigDecimal;

/*
有一个String[]数组如下：
String[] nums = {"3.22","8.1","7","2.5","3.1","7.77","8.0","9.21"};
请编程计算它们的平均值，结果精确到小数点后两位。
 */
public class Test {
    public static void main(String[] args) {
        //创建字符串类型数组
        String[] nums = {"3.22","8.1","7","2.5","3.1","7.77","8.0","9.21"};
        //将数组中的内容转换成bigdecimal，然后加起来
        //创建一个BigDecimal的对象用来存储和
        BigDecimal count = new BigDecimal("0");
        //遍历数组并求和
        for (String num : nums) {
            count = count.add(new BigDecimal(num));
        }
        //求平均值
        BigDecimal avg = count.divide(new BigDecimal(nums.length),2,BigDecimal.ROUND_HALF_UP);
        System.out.println(avg);
    }
}
//bigdecimal 进行运算后 是返回了一个新的BigDecimal对象，所以需要将运算后的值，重新赋给原对象