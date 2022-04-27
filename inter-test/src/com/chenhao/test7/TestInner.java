package com.chenhao.test7;

public class TestInner {
    public static void main(String[] args) {
        //普通成员内部类
        Outer1.inner io = new Outer1().new inner();
        io.eat();
        //私有成员内部类
        Outer ou = new Outer();
        ou.method();
        //静态成员内部类
        Outer1.inner2 io2 = new Outer1.inner2();
        io2.study();;
    }
}

class Outer1 {
        private int a =100;
    public void method(){
        inner1 in = new inner1();
        in.drink();
    }
    //成员内部类
    class inner {
        private int a = 200;
        public void eat() {
            int a =300;
            System.out.println("晚上吃的白菜还有黄瓜");
            System.out.println(Outer1.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }
    //私有成员内部类
    private class inner1 {
        public void drink() {
            System.out.println("只能喝茶");
        }
    }
    //静态成员内部类
    static class inner2{
        public void study(){
            System.out.println("晚上进行自习");
        }
    }
}

