package com.chenhao.homework.test3;
/*
1. 创建类Calculate ，包含4个方法：加、减、乘、除，
使用Junit对4个方法进行单元测试。
2. 测试类中：在每个方法运行之前创建Calculate对象，
在测试方法运行完毕之后将对象设置为null 。
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDemo {
    Calculate calculate;

    @Before
    public void before() {
        calculate = new Calculate();
    }
    @After
    public void after() {
        calculate = null;
    }
    @Test
    public void test1() {
        System.out.println("加法结果为："+calculate.add(20, 30));
    }
    @Test
    public void test2() {
        System.out.println("减法结果为："+calculate.subtract(20, 30));
    } @Test
    public void test3() {
        System.out.println("乘法结果为："+calculate.multiply(20, 30));
    } @Test
    public void test4() {
        System.out.println("除法结果为："+calculate.divide(20, 30));
    }
}
