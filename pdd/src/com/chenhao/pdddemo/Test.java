package com.chenhao.pdddemo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
完成如上砍一刀功能接口开发，用户点击‘帮好友砍一刀’，进行砍价。
1.用户点击  ‘帮好友砍一刀’  给该用户砍掉部分金额。
2.每个用户只能砍价一次。 不得多次砍价
3.当金额为0时，砍价失败。
4.建议先思考写，写完，再看需求效果图

1.模拟一个初始需要砍价的用户的名称，和砍价金额， 总金额。 （建议用对象表示）
2.用户点击，进行金额随机减少，并且记录砍价用户和砍价金额。（记录砍价用户信息和砍价金额也建议使用对象存储）
3.展示砍价信息。。如上图:需要展示 被砍人金额，相差金额。。。砍价人以及金额 信息
按照实际砍价业务需求，在极端情况下有可能一个用户直接砍价结束，
防止这个问题可以设定为砍价人数必须达到某个阈值才能砍价成功。
（假设阈值= 30   那么也就是必须砍价人数达到30才能砍价成功，
也就是最后一个人直接砍完剩下的金额即可）
 */
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1先创建一个砍价用户。
        ChopUser chopUser1 = new ChopUser();

        //给出提示，输入用户名
        System.out.println("头铁的用户请输入你的姓名");
        String name = sc.next();
        chopUser1.setName(name);
        //请用户选择商品，并设置总金额.
        chopUser1.setTotalMoney(new BigDecimal(100));
        System.out.println("幸运的VIP用户" +"**"+chopUser1.getName()+"**"+ "您获得了" + chopUser1.getTotalMoney() + "元红包");
        System.out.println("邀请用户为您随机砍一刀，砍到0元即可立即提现");
        //在砍价之前创建一个存储帮忙砍价的用户的集合。
        ArrayList<HelpForChopUser> goodPeopleList = new ArrayList<>();
        //定义一个计数器，计算砍价数
        int count = 0;
        while (true) {
            //创建一个帮忙砍价的用户对象
            HelpForChopUser goodPeople = new HelpForChopUser();
            //提示输入帮忙砍价的用户
            String goodPeopleName;

            //对用户名称进行判断，确定该用户是否已经进行过砍价
            // 如果没有进行过砍价，则可进行砍价。如果已经进行过砍价则给出对应提示。
            while (true) {
                System.out.println("请输入热心老铁的姓名");
                goodPeopleName = sc.next();
                boolean result = isHelpFor(goodPeopleList, goodPeopleName);
                if (result) {
                    System.out.println("该用户已经帮您砍过了，请邀请其他用户为您砍价");
                } else {
                    break;
                }
            }

            goodPeople.setName(goodPeopleName);
            //用户砍价，就是生成一个随机数代表砍价的金额。
            chopMoney(goodPeople);

            goodPeopleList.add(goodPeople);
            //进行砍价，并判断是否砍价成功。如果成功就结束循环。如果不成功就继续找用户砍价
           boolean isSuccess =  minusMoney(chopUser1,goodPeople);
           //如果砍价成功，那么结束循环。
            count++;
           if(isSuccess){
               System.out.println("恭喜你砍价成功了！！！！");
               break;
           }

           //如果砍价不成功，则将剩余金额，和帮忙砍价的用户信息显示出来
            showInfo(chopUser1,goodPeopleList);

        }
        showInfo(goodPeopleList);
        System.out.println("一共砍了"+count+"刀");

    }


    //显示剩余金额，和帮忙砍价的用户信息
    public static void showInfo(ChopUser chopUser1, ArrayList<HelpForChopUser> goodPeopleList) {

        //显示已经砍价的金额和剩余金额
        System.out.println("距离提现又进一步了！！加油啊！！");
        System.out.println("已砍"+chopUser1.getCountMinusMoney()+"元,"+"还差"+(chopUser1.getTotalMoney().subtract(chopUser1.getCountMinusMoney())));
        System.out.println("------------------------------------------------");
        System.out.println("-------------------砍价帮-----------------------");

        //显示帮忙砍价的用户，以及他们砍价的金额
        //System.out.println("热心的老铁");
        for (int i = 0; i < goodPeopleList.size(); i++) {
            HelpForChopUser goodPeo = goodPeopleList.get(i);
            if(null!=goodPeo){
                System.out.println(goodPeo.getName()+"------"+"砍掉"+goodPeo.getChopMoney()+"元");
            }
        }
    }
    public static void showInfo(ArrayList<HelpForChopUser> goodPeopleList){
        for (int i = 0; i < goodPeopleList.size(); i++) {
            HelpForChopUser goodPeo = goodPeopleList.get(i);
            if(null!=goodPeo){
                System.out.println(goodPeo.getName()+"\t\t"+"砍掉"+goodPeo.getChopMoney()+"元");
            }
        }
    }

    //判断是否砍价成功
    public static boolean minusMoney(ChopUser chopUser1, HelpForChopUser goodPeople) {
        //判断砍价是否成功，将用户砍掉的金额加到统计的砍价的金额上。并将砍掉的金额统计与总金额进行比较。
        //如果总计金额大于等于总金额，那么就表示砍价成功。
        //
        chopUser1.setCountMinusMoney(chopUser1.getCountMinusMoney().add(goodPeople.getChopMoney()) );//将这次的砍价金额加到统计上
        BigDecimal result = chopUser1.getTotalMoney().subtract(chopUser1.getCountMinusMoney());
        if(result.doubleValue()<=0){
            return true;
        }else{
            return false;
        }
    }

    //用户进行砍价，生成砍价金额
    public static void chopMoney(HelpForChopUser goodPeople) {
        int count = 10;//生成砍价金额前对count进行判断，如果count等于1，那砍价金额就必须小于被砍的总价。
                        //如果砍价次数等于设置的阈值，那这次砍价必须成功
        //防止这个问题可以设定为砍价人数必须达到某个阈值才能砍价成功。
        //（假设阈值= 30   那么也就是必须砍价人数达到30才能砍价成功，
        //也就是最后一个人直接砍完剩下的金额即可）


        //用户进行砍价，随机生成一个金额
        Random r = new Random();
        double result = r.nextDouble();
        //用户砍价的金额保留两位小数。并精确计算。需要转换成BigDecimal类型
        String str = result + "";//先转换成字符串形式
        //由于生成的随机数是一个0~1之间的数，所以要对其先保留三位小数，然后乘10；
        BigDecimal bigDecimal = new BigDecimal(str);
        bigDecimal=bigDecimal.divide(new BigDecimal(1), 2, BigDecimal.ROUND_HALF_UP);
        BigDecimal money = bigDecimal.multiply(new BigDecimal(100));
        //double money = bigDecimal.doubleValue();
        goodPeople.setChopMoney(money);
    }

    //判断用户名是否存在
    public static boolean isHelpFor(ArrayList<HelpForChopUser> goodPeopleList, String goodPeopleName) {
        //假设该用户名不存在
        boolean flag = false;
        //判断集合中是否有该用户的姓名，如果已经存在该用户，则返回true，如果不存在则返回FALSE
        for (int i = 0; i < goodPeopleList.size(); i++) {
            HelpForChopUser temp = goodPeopleList.get(i);
            if (null != temp) {
                if (goodPeopleName.equals(temp.getName())) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

}
