package com.chenhao.pdd2.controller;

import com.chenhao.pdd2.domain.ChopUser;
import com.chenhao.pdd2.domain.GoodPerson;
import com.chenhao.pdd2.service.PddService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class PddController {
    private static ChopUser chopUser = new ChopUser();
    private BigDecimal money = new BigDecimal(100);
    PddService pddService = new PddService();

    public void Start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("你得到了一百元的现金红包！！邀请好友进行砍价，砍到0元即可提现");
        System.out.println("头铁的用户，请输入你的姓名");
        String name = sc.next();
        chopUser.setName(name);
        chopUser.setChopMoneyForTotal(money);
        System.out.println("难度系数"+chopUser.getHard());
        System.out.println("你的名字真好听，现在开始邀请好友进行砍价吧");

        while (chopUser.getChopMoneyForCount().compareTo(chopUser.getChopMoneyForTotal())==-1) {
            //进行砍价
            System.out.println("输入好友的姓名");
            //姓名输入后，进行判断该姓名是否存在。如果不存在则会进行砍价并记录下来。如果存在则不进行
            String googPersonName;
            while (true) {

                googPersonName = sc.next();
                boolean result = pddService.isExists(googPersonName);//如果返回的是true 则存在。如果为false则不存在；
                if (result) {
                    System.out.println("该好友已经帮你砍过了，不要再麻烦他了");
                } else {
                    break;
                }
            }
            //好友帮忙砍价成功后，需要对好友的砍价金额加到砍价金额的计数器上
            pddService.starChop(googPersonName, chopUser);

            System.out.println("好友帮忙砍价成功");


            //砍价完成之后，需要所有砍价的信息进行打印
            showGoodPerson();
        }
        System.out.println("恭喜您，砍价完成");
    }

    private void showGoodPerson() {
        //打印现在已经砍价的金额和剩余需要砍价的金额
        System.out.println("已砍" + chopUser.getChopMoneyForCount() + ",还差" + chopUser.getChopMoneyForTotal().subtract(chopUser.getChopMoneyForCount()) + "元");
        //获得帮忙砍价用户的数组
        ArrayList<GoodPerson> goodPersonArr = pddService.showGoodPerson();
        System.out.println("============砍价帮=============");
        for (int i = 0; i < goodPersonArr.size(); i++) {
            GoodPerson goodPerson = goodPersonArr.get(i);
            if (null != goodPerson) {
                System.out.println(goodPerson.getName() + "----------" + goodPerson.getHelpForMoney());
            }
        }
    }
}
