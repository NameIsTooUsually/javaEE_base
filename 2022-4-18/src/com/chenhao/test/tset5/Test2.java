package com.chenhao.test.tset5;

import java.lang.reflect.Field;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //创建字节码文件对象
        Class<?> aClass = Class.forName("com.chenhao.test.tset5.Student");
        //获取Field对象
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==============");
        //获取单个变量
        Field many = aClass.getDeclaredField("many");
        Field id = aClass.getDeclaredField("id");
        System.out.println(many);
        System.out.println(id);

    }
}
