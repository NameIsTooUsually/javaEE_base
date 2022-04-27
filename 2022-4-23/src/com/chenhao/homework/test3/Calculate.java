package com.chenhao.homework.test3;

import java.math.BigDecimal;

/*
1. 创建类Calcuate ，包含4个方法：加、减、乘、除，
使用Junit对4个方法进行单元测试。
2. 测试类中：在每个方法运行之前创建Calcuate对象，
在测试方法运行完毕之后将对象设置为null 。
 */
public class Calculate {
    //加方法
    public int add(int a, int b) {
        return a + b;
    }

    //减方法
    public int subtract(int a, int b) {
        return a - b;
    }

    //乘方法
    public int multiply(int a, int b) {
        return a * b;
    }

    //除方法
    public double divide(int a, int b) {
        BigDecimal result = new BigDecimal(a).divide(new BigDecimal(b), 2, BigDecimal.ROUND_HALF_UP);
        return result.doubleValue();
    }
}