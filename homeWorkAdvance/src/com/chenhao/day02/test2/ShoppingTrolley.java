package com.chenhao.day02.test2;


import java.util.ArrayList;

//创建购物车类。用来存储商品
public class ShoppingTrolley {

    //在购物车类GouWuChe中定义ArrayList成员变量,用于保存购物车中的商品
    ArrayList<Goods> list = new ArrayList();
    //在购物车类GouWuChe中定义addGoods方法,参数为(Goods goods).addGoods方法功能是将商品保存到ArrayList集合中
    public void addGoods(Goods goods) {
        System.out.println("加入 " + goods.getName() + " 成功");
        list.add(goods);
    }
    //购物车类GouWuChe中定义showGoods方法.showGoods方法功能是遍历ArrayList集合中的所有商品信息并打印
    public void showGoods() {
        System.out.println("您选购的商品为:");
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            System.out.println("\t" + goods.getId() + "," + goods.getName() + "," + goods.getPrice());
        }
    }
    //在购物车类GouWuChe中定义total方法.total方法功能是计算ArrayList集合中的所有商品的总价和折后价格,并输出
    public void total() {
        double off = 0; // 折扣价
        double sum = 0; // 原价
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            double price = goods.getPrice();
            sum += price;
            // 如果商品为电子产品,就打折计算
            if (goods instanceof EGoods) {
                price *= 0.88;
            }
            off += price;
        }
        System.out.println("------------------");
        System.out.println("原 价为:" + sum + " 元");
        System.out.println("折后价为:" + off + " 元");
    }
}
