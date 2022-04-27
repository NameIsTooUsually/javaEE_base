package com.chenhao.test.test6;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //method1();
        //method2();
        //method3();
        //method4();
    }

    public static void method4() throws ClassNotFoundException, NoSuchMethodException {
        //创建类的字节码对象
        Class<?> aClass = Class.forName("com.chenhao.test.test6.Student");
        //获取奔雷method对象，包括私有的
        Method money = aClass.getDeclaredMethod("money",int.class);
        System.out.println(money);
    }

    public static void method3() throws ClassNotFoundException {
        //创建类的字节码对象
        Class<?> aClass = Class.forName("com.chenhao.test.test6.Student");
        //获取本类所有的method对象，包括私有的
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    public static void method2() throws ClassNotFoundException, NoSuchMethodException {
        //创建类的字节码对象
        Class<?> aClass = Class.forName("com.chenhao.test.test6.Student");
        //获取单个method对象包括继承的
        Method method = aClass.getMethod("notify");
        System.out.println(method);
    }

    public static void method1() throws ClassNotFoundException {
        //创建类的字节码对象
        Class<?> aClass = Class.forName("com.chenhao.test.test6.Student");
        //获取所有的method对象，包括继承的
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
