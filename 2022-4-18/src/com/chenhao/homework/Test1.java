package com.chenhao.homework;

import java.lang.reflect.Constructor;

/*
要求
定义一个Student类，用反射去创建一个Student对象，要求使用两种方式：
1. 通过Class对象的方法创建。
2. 通过Constructor对象的方法创建。
 */
public class Test1 {
    public static void main(String[] args) throws Exception{
        //method1();//1. 通过Class对象的方法创建。
        //通过Constructor对象的方法创建。
        //创建类的字节码文件的对象
        Class<?> aClass = Class.forName("com.chenhao.homework.Student");
        //获取constructor对象
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class,String.class,String.class);
        //创建student对象
        Student student = (Student) constructor.newInstance("007", "狗子", "男");
        //打印学生对象
        System.out.println(student);
    }

    public static void method1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //创建类的字节码文件的对象
        Class<?> aClass = Class.forName("com.chenhao.homework.Student");
        //通过Class对象的方法创建。
        Student student = (Student) aClass.newInstance();
        //打印学生对象
        System.out.println(student);
    }
}
