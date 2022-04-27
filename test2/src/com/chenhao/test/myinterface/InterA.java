package com.chenhao.test.myinterface;

public interface InterA {
    int a = 10;
    public abstract void eat();
    public abstract  void study();

    public default void play() {
        System.out.println("还不好好学习，还想着玩呢");
    }
    public static void drint(){
        System.out.println("当然是喝水了，难道还要喝饮料吗？？" );
    }
}
