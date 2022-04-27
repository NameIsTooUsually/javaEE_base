package com.chenhao.test.interpolymorphic;

public class TestInterPoly {
    public static void main(String[] args) {
        InterA ia = new ClassC();
        ia.eat();
        ia.study();
        if(ia instanceof ClassC){
            ((ClassC)ia).drink();
        }

    }
}
