package com.chenhao.api;

public class Test2 {
    public static void main(String[] args) {
       implementAB iab = new implementAB();
       iab.show();

    }
}
interface A{
    public default void show(){
        System.out.println("A中的show方法");
    }
    public static void study(){
        System.out.println("好好学习天天向上");
    }
}

class implementAB implements A{


    public void method() {
        System.out.println("自己的show方法");
    }
    /*public void study(){
        System.out.println("我是实现类中的方法" );
    }*/
}