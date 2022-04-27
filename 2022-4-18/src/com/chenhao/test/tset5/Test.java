package com.chenhao.test.tset5;



import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建class文件
        Class aClass = Class.forName("com.chenhao.test.tset5.Student");
        Constructor d1 = aClass.getDeclaredConstructor();
        Student student = (Student) d1.newInstance();
        System.out.println(student);


        Constructor d2 = aClass.getDeclaredConstructor(String.class);
        d2.setAccessible(true);
        Student student1 = (Student) d2.newInstance("二狗子");
        System.out.println(student1);

        Constructor d3 = aClass.getDeclaredConstructor(String.class,String.class,String.class);
        Student studen3 = (Student) d3.newInstance("张三", "23", "nan");
        System.out.println(studen3);
    }
}
