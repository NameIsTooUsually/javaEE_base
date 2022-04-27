package com.chenhao.day03;
/*
定义类描述手机和电脑，二者都具有开机、关机和玩游戏的功能，并提供测试类测试玩游戏的东西；
开机和关机是电子产品的基本功能，所以定义为抽象类中的方法。玩游戏是扩展功能定义为接口中的方法
 */
public class Test {
    public static void main(String[] args) {
        //创建手机和电脑对象
        phone ph = new phone();
        computer cp = new computer();
        ph.open();
        ph.playGame();
        ph.close();

        cp.open();
        cp.playGame();
        cp.close();
    }
}
//定义一个电子产品类
abstract class electronic{
    public abstract void open();
    public abstract void close();
}
//定义一个玩游戏接口
interface Game{
    void playGame();
}
//创建一个手机类
class phone extends electronic implements Game{

    @Override
    public void open() {
        System.out.println("开机");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("欢迎使用有为手机");
    }

    @Override
    public void close() {
        System.out.println("关机");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("关机了");
    }

    @Override
    public void playGame() {
        System.out.println("王者荣耀真好玩");
    }
}
class computer extends electronic implements Game{
    @Override
    public void open() {
        System.out.println("开机");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("欢迎使用鼓包精灵");

    }

    @Override
    public void close() {
        System.out.println("关机");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("关机了");
    }


    @Override
    public void playGame() {
        System.out.println("欢迎来到狗熊联盟");
    }
}
