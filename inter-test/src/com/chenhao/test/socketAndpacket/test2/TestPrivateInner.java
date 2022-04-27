package com.chenhao.test.socketAndpacket.test2;


public class TestPrivateInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    Outer1.Inner1 io = new Outer1.Inner1();
        io.eat();
        Outer1.Inner1.drink();
}
}
class Outer{

    public void method(){
        Inner i = new Inner();
        i.study();
    }
    private class Inner{
        public void study(){
            System.out.println("最喜欢上班时间来摸鱼了！！" );
        }
    }
}
class Outer1{
    static class Inner1{
        public void eat(){
            System.out.println("晚上吃什么？是个非常难回答的问题");
        }
        static void drink(){
            System.out.println("每天都要喝水");
        }
    }
}