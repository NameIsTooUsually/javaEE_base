package com.chenhao.apitest.test4;

import java.math.BigDecimal;

/*
有以下double数组：
		double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
	请编程计算它们的总值及平均值(四舍五入保留小数点后2位)

 */
public class Test {
    public static void main(String[] args) {
        //求数组平均值，并四舍五入保留两位小数
        //需要用到BigDecimal

        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};

        //创建一个对象用来接收总值
        BigDecimal total = new BigDecimal("0");
        //用for循环将数组中的元素转换成BigDecimal类型。（先转换成字符串类型）
        for (int i = 0; i < arr.length; i++) {
            total = total.add(new BigDecimal(String.valueOf(arr[i])));
        }
        //求平均值会用到数组的长度，将数组的长度也转换成一个BigDecimal类型。
        BigDecimal arrLength = new BigDecimal(Integer.toString(arr.length));

        //计算平均值
        BigDecimal ave = total.divide(arrLength,2,BigDecimal.ROUND_HALF_UP);
        System.out.println("平均值："+ave);
    }
}
