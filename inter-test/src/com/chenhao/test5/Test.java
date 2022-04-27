package com.chenhao.test5;
public class Test{
    public static void main(String[] args) {
    XiaoMing xm = new XiaoMing();
    xm.eat();
    xm.drink();
    xm.sleep();
    }
}
 class XiaoMing implements InterA ,InterB{
    @Override
    public void sleep() {
        System.out.println("一觉睡到十二点");
    }

    @Override
    public void eat() {
        System.out.println("一天可以吃十餐饭");
    }

    @Override
    public void drink() {
        System.out.println("只喝碳酸饮料");
    }
}
