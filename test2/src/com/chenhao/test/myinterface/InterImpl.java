package com.chenhao.test.myinterface;

public class InterImpl implements InterA,InterB{
    @Override
    public void study() {
        System.out.println("好好学习，天天向上");
    }

    /*@Override
    public void drink() {
        System.out.println("喝白开水");
    }*/

    @Override
    public void eat() {
        System.out.println("吃大米饭");
        System.out.println("a="+a);
    }
    public static void drink(){
        System.out.println("实现类中的喝开水的方法");
    }
}
