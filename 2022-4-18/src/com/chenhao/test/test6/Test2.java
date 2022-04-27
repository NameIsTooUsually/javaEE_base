package com.chenhao.test.test6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//用反射来调用方法
public class Test2 {
    public static void main(String[] args) throws Exception {
        //method1();
        //调用公共有参有返回值的方法
        //创建字节码文件对象
        Class<?> aClass = Class.forName("com.chenhao.test.test6.Student");
        //获取method对象
        //创建类对象
        Constructor<?> studen = aClass.getDeclaredConstructor(String.class);
        studen.setAccessible(true);
        Student student = (Student) studen.newInstance("用这个方法来锻炼一下");

        Method swin = aClass.getDeclaredMethod("swin", int.class);
        Object swin1 = swin.invoke(student, 5);
        System.out.println(swin1);
    }

    public static void method1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //调用的私有有参有返回值的方法
        //创建字节码文件对象
        Class<?> aClass = Class.forName("com.chenhao.test.test6.Student");
        //创建method对象
        Method money = aClass.getDeclaredMethod("money", int.class);
        money.setAccessible(true);
        //创建类对象
        Student student = (Student) aClass.newInstance();
        Object invoke = money.invoke(student, 15);
        System.out.println(invoke);
    }
}
