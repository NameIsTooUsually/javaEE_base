package com.chenhao.test.threaddemo6;
//桌子对象，存放汉堡，并计数已经吃了几个汉堡
public class Desk {
    //该变量判断桌子上是否有汉堡，有为true ，没有为false
    private boolean hamburger;
    //该参数代表吃货已经吃了几个汉堡
    private int count;

    public Desk() {

    }

    public Desk(int count) {
        this.count = count;
    }

    public Desk(boolean hamburger, int count) {
        this.hamburger = hamburger;
        this.count = count;
    }

    public boolean isHamburger() {
        return hamburger;
    }

    public void setHamburger(boolean hamburger) {
        this.hamburger = hamburger;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
