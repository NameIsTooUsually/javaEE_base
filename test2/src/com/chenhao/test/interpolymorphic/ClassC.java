package com.chenhao.test.interpolymorphic;



public class ClassC implements InterA {


    @Override
    public void study() {
        System.out.println("好好学习，天天向上！！！");
    }

    @Override
    public void eat() {
        System.out.println("多吃青菜少吃肉！！");
    }

    public void drink(){
        System.out.println("少喝饮料，多喝热水！！");
    }
}
