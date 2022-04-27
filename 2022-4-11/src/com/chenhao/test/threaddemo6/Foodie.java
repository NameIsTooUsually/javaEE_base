package com.chenhao.test.threaddemo6;
/*
- 桌子上有汉堡包，就吃；吃完了，汉堡包没了，并告诉厨师继续做
- 桌子上没有汉堡包，就等
 */
public class Foodie implements Runnable{
    private Desk desk;

    public Foodie(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
                //不知道要循环多少次，创建一个while循环
            while (true) {
                //利用synchronized，对部分代码进行上锁
                synchronized (desk) {
                if (desk.getCount() == 0) {
                    //此时计数已经没有了，需要退出
                    break;
                } else {
                    //对桌子进行判断，如果有就吃，没有进喊厨师来做
                    if (desk.isHamburger()) {
                        System.out.println("吃货吃了一个汉堡");
                        desk.setHamburger(false);
                        //吃掉一个汉堡，汉堡数就减一
                        desk.setCount(desk.getCount() - 1);
                        //唤醒厨师
                        desk.notifyAll();
                    }else{
                        try {
                            //如果没有汉堡进在这等待
                            desk.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
