package com.chenhao.homework.test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
要求
1. 定义一个Person类，包含私有属性name、age，getXxx和setXxx方法和有参满参构造方法。
2. 使用反射的方式创建一个实例、调用构造函数初始化name、age
使用反射方式调用setName方法对姓名进行设置，不使用setAge方法直接使用反射方式对age赋值。


 */
public class Test {
    public static void main(String[] args) throws Exception {
        //创建一个字节码文件对象
        Class<?> aClass = Class.forName("com.chenhao.homework.test1.Student");
        //使用反射的方式创建一个实例、调用构造函数初始化name、age。调用有参构造创建对象
        //获取有参的constructor对象
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class, int.class);
        //创建对象
        Student student = (Student) constructor.newInstance("张三", 29);
        System.out.println(student);
        //使用反射方式调用setname对姓名进行设置
        //获取method对象
        Method setName = aClass.getDeclaredMethod("setName", String.class);
        //执行方法
        setName.invoke(student,"李四");

        //不使用setAge方法直接使用反射方式对age赋值。
        //获取Field对象
        Field age = aClass.getDeclaredField("age");
        //取消访问权限限制
        age.setAccessible(true);
        //对标量进行赋值
        age.set(student,24);
        System.out.println(student);
    }

}
