package com.chenhao.test.test1;

public class Test {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //获取平台类加载器
        ClassLoader platformClassLoder = systemClassLoader.getParent();
        //获取根加载器
        ClassLoader bootstrapClassLoader = platformClassLoder.getParent();
        System.out.println("系统类加载器"+systemClassLoader);
        System.out.println("平台类加载器"+platformClassLoder);
        System.out.println("根类加载器"+bootstrapClassLoader);
    }
}
