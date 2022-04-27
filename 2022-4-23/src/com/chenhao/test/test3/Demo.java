package com.chenhao.test.test3;

public class Demo {
    @StartDemo("张三")
    public void study(String s){
        System.out.println(s+"不要打扰我学习");
    }
    @StartDemo
    public void swimming(String s){
        System.out.println(s+"铁子，我们去游泳吧");
    }
    public void play(String s){
        System.out.println("铁子，我们去打篮球吧");
    }
}
