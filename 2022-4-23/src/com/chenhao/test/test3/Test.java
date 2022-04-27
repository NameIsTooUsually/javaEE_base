package com.chenhao.test.test3;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //创建字节码对象
        Class<?> aClass = Class.forName("com.chenhao.test.test3.Demo");
        System.out.println(aClass.isAnnotationPresent(StartDemo.class));




       /* //创建该类对象
        Demo demo = (Demo) aClass.newInstance();
        //获得method对象
        Method[] methods = aClass.getDeclaredMethods();
        //对方法进行判断
        for (Method method : methods) {
            if (method.isAnnotationPresent(StartDemo.class)){
                //获取注解对象
                StartDemo startDemo = method.getAnnotation(StartDemo.class);
                //获取该注解对象的的值
                String s = startDemo.value();
                if(s.equals("张三")){
                    method.invoke(demo,s);
                }else{
                    method.invoke(demo,"不配拥有姓名");
                }
            }
        }*/
    }
}
