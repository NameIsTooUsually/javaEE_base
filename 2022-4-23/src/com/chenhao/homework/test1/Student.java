package com.chenhao.homework.test1;

import org.junit.Test;

/*
1、 请将`Junit`工具包加入到项目中；
2、定义一个`Student`类，定义以下方法：
 */
public class Student {
    @Test
    public void Test() {
       show();
    }

    public void show() {
        System.out.println("大家好，我是传智的一名学生，我正在学Java");
    }
}