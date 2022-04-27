package com.chenhao.test1;

public class TestInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        //o.method();
      /*  Outer.Inner io =new Outer.Inner();
        io.a = 40;
        Outer.Inner ii =new Outer.Inner();
        System.out.println(ii.a);*/
        System.out.println( o.toString());
    }
}

class Outer {
    public void method(){
        Inner i = new Inner();
        i.study();
    }

    @Override
    public String toString() {
        return "Outer{" +
                "a=" + a +
                ", str='" + str + '\'' +
                '}';
    }

    int a = 10;
    String str = "helloWord";
    static class Inner{
        int a ;
        public static void study(){

        }
    }
}
