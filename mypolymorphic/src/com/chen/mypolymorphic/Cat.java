package com.chen.mypolymorphic;

public class Cat extends Animal {
    int a = 30;
    @Override
    public void eat(){
        System.out.println("有"+a+"只猫吃鱼");
    }
    public void swimming(){
        System.out.println("加菲猫不会游泳");
    }
}
