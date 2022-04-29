package com.chenhao.day02.test2;
/*
模拟各种商品添加到购物车，电子商品打8.8折优惠，展示所有商品信息。
1.定义购物车类。
2.使用ArrayList作为成员变量，保存各种商品对象。
3.提供添加商品，移除商品，计算总价的方法。
4.定义商品类Goods，包含商品名称，id，价格等属性。
5.定义电子商品类EGoods继承Goods。
6.定义笔记本类Laptop继承电子商品EGoods类。
7.定义手机类继承继承电子商品EGoods类类。
8.定义水果类Fruit继承商品类。
 */
public class Test2 {
    public static void main(String[] args) {
        //在main方法中创建GouWuChe对象gouWuChe
        ShoppingTrolley gouWuChe = new ShoppingTrolley();
        //在main方法中创建商品Laptop,名称为:笔记本,id为:g10000,价格为:10000
        Goods g1 = new Laptop("g10000","笔记本", 10000);
        //在main方法中创建商品Phone,名称为:手机,id为:g10001,价格为:5000
        Goods g2 = new Phone( "g10001", "手机",5000);
        //在main方法中创建商品Fruit,名称为:苹果,id为:g20000,价格为:50
        Goods g3 = new Fruit( "g20000", "苹果",50);

        System.out.println("============添加商品=================");
        //调用购物车的addGoods方法将3个商品添加到购物车中
        gouWuChe.addGoods(g1);
        gouWuChe.addGoods(g2);
        gouWuChe.addGoods(g3);
        System.out.println("============打印商品=================");
        //调用购物车的showGoods方法,显示购物车中的商品信息
        gouWuChe.showGoods();
        //调用购物车的total方法,显示购物车中所有商品的价格
        gouWuChe.total();
    }
}
