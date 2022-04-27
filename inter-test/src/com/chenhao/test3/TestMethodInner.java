package com.chenhao.test3;

public class TestMethodInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}
class Outer{
    public void method(){
        class Inner{
            public void study(){
                System.out.println("自习时间感觉学习效率比较差");
            }
        }
        Inner in = new Inner();
        in.study();
    }
}