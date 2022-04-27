package com.chenhao.test.test3;

import com.sun.xml.internal.bind.v2.TODO;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //通过Class的静态方法
        Class<?> aClass = Class.forName("com.chenhao.test.test3.Student");
        System.out.println(aClass);
        //通过类名获取
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);
        //通过对象获取
        Class<? extends Student> aClass1 = new Student().getClass();
        System.out.println(aClass1);

        System.out.println(aClass==studentClass);
        System.out.println(aClass1==studentClass);

    }
}
