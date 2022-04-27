package com.chenhao.test.threaddemo6;
/*
    1、厨师他会查看桌子，如果桌子上没有汉堡，他就会做一个汉堡放在桌子上。
    汉堡做好之后，他会叫醒吃货来吃。
    2、如果桌子上有汉堡，那厨师就会等待。
     */
public class Cooker implements Runnable{
    private Desk desk;

    public Cooker(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        //由于不知道循环次数，创建一个while循环
            while(true){
                synchronized (desk){
                    if(desk.getCount()==0){
                        break;
                    }else{
                        //厨师判断桌子上是否有汉堡
                        if(!desk.isHamburger()){
                            //没有汉堡，厨师需要做汉堡
                            System.out.println("厨师做了一个汉堡"+(11-desk.getCount()));
                            desk.setHamburger(true);
                            //喊吃货来吃汉堡
                            desk.notifyAll();
                        }else{
                            //桌上有汉堡，那厨师就等待
                        }
                    }
                }
            }
    }
}
