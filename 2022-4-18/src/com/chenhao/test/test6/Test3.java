package com.chenhao.test.test6;

import java.lang.reflect.Field;

public class Test3 {
    public static void main(String[] args) throws Exception {
        //通过反射来使用变量
        //创建一个类的字节码对象
        Class<?> aClass = Class.forName("com.chenhao.test.test6.Student");
        //创建Field对象
        Field id = aClass.getDeclaredField("id");
        id.setAccessible(true);
        //创建类对象
        Student student = (Student) aClass.newInstance();
        //使用变量
        id.set(student,"0000007号");
        Object o = id.get(student);
        System.out.println(student);
        System.out.println(o);
    }
}
