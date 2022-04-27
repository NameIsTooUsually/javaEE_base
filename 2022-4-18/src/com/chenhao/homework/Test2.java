package com.chenhao.homework;

import java.lang.reflect.Method;

/*
要求
定义一个类，在类中定义一个成员方法 show ，方法功能是：打印一个字符串。
使用反射机制创建该类的对象，并调用该对象的 show 方法。
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //创建类的字节码文件对象
        Class<?> aClass = Class.forName("com.chenhao.homework.Student");
        //创建该类的对象。使用简易方法
        Student student = (Student) aClass.newInstance();
        //创建method对象
        Method show = aClass.getDeclaredMethod("show");
        //调用方法
         show.invoke(student);
    }
}
