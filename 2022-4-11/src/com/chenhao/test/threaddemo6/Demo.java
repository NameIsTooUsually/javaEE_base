package com.chenhao.test.threaddemo6;

public class Demo {
    public static void main(String[] args) {
        //创建桌子对象
        Desk desk = new Desk(10);
        //创建吃货对象和厨师对象
        Cooker cooker =new Cooker(desk);
        Foodie foodie = new Foodie(desk);
        Thread t1 = new Thread(cooker);
        Thread t2 = new Thread(foodie);

        t1.start();
        t2.start();
    }
}
