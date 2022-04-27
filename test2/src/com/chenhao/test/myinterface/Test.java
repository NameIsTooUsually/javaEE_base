package com.chenhao.test.myinterface;

import com.chenhao.test.testinterface.Daobao;

import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {
        Daobao.print();
        InterImpl ii = new InterImpl();
        ii.study();
        ii.drink();
        ii.eat();
        ii.play();
        int a  = InterA.a;


    }
}
