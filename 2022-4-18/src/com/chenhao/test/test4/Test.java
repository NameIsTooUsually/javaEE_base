package com.chenhao.test.test4;


import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //method1();
        //method2();
        //method3();
        //获取class对象
        Class<?> aClass = Class.forName("com.chenhao.test.test4.Student");
        Constructor<?> s = aClass.getDeclaredConstructor(String.class);
        System.out.println(s);

    }

    public static void method3() throws ClassNotFoundException, NoSuchMethodException {
        //获取class对象
        Class<?> aClass = Class.forName("com.chenhao.test.test4.Student");
        //获取单个公共构造
        Constructor<?> d = aClass.getConstructor(String.class,String.class,String.class);
        System.out.println(d);
    }

    public static void method2() throws ClassNotFoundException {
        //获取class对象
        Class<?> aClass = Class.forName("com.chenhao.test.test4.Student");
        //获取public对象
        Constructor<?>[] d = aClass.getConstructors();
        for (Constructor<?> constructor : d) {
            System.out.println(constructor);
        }
    }

    public static void method1() throws ClassNotFoundException {
        //获取class对象
        Class<?> aClass = Class.forName("com.chenhao.test.test4.Student");
        //获取所有构造方法
        Constructor<?>[] d = aClass.getDeclaredConstructors();
        //遍历
        for (Constructor<?> constructor : d) {
            System.out.println(constructor);
        }
    }
}
