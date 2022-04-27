package com.chenhao.pdd2.service;

import com.chenhao.pdd2.dao.PddDao;
import com.chenhao.pdd2.domain.ChopUser;
import com.chenhao.pdd2.domain.GoodPerson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class PddService {
    PddDao pddDao = new PddDao();

    public boolean isExists(String googPersonName) {
        //先假设该用户没有进行过砍价
        boolean flag = false;
        //得到帮忙砍价的好友集合
        ArrayList<GoodPerson> goodPeopleArr = pddDao.findAllGoodPerson();

        for (int i = 0; i < goodPeopleArr.size(); i++) {

            //String name = goodPeopleArr.get(i).getName();
            GoodPerson goodPerson = goodPeopleArr.get(i);
            if (null != goodPerson && googPersonName.equals(goodPerson.getName())) {
                flag = true;
                break;
            }
        }
        return flag;

    }

    //这是一个砍价程序，根据用户砍价难度，砍价次数生成砍价金额；
//好友帮忙砍价成功后，需要对好友的砍价金额加到砍价金额的计数器上
    public void starChop(String name, ChopUser chopUser) {
        //创建一个砍价用户对象
        GoodPerson goodPerson1 = new GoodPerson();

        //先为砍价计数的值加一
        int count = chopUser.getCountChop();
        chopUser.setCountChop(count + 1);
        int hard = chopUser.getHard();//获取用户砍价的难度
        count = chopUser.getCountChop();//获取用户已经砍价的次数
        //先进行判断，如果砍价次数和难度相等，那么这一次生成的砍价金额刚好够砍价完成
        if (hard == count) {
            BigDecimal chopMoney = chopUser.getChopMoneyForTotal().subtract(chopUser.getChopMoneyForCount());
            goodPerson1.setName(name);
            goodPerson1.setHelpForMoney(chopMoney);

        } else {
            Random r = new Random();
            double money = r.nextDouble();//生成一个0-1（不包括1）的随机的double类型的数
            //将这个数转成一个BigDecimal类型，并且乘以砍价的目标金额
            BigDecimal bigDecimalMoney = new BigDecimal(money + "").multiply(chopUser.getChopMoneyForTotal());
            //将这个数分成 最多砍价次数 份。这样控制每次可以保证不会出现每次砍价的金额过大。
            bigDecimalMoney = bigDecimalMoney.divide(new BigDecimal(chopUser.getHard()), 2, BigDecimal.ROUND_HALF_UP);
            goodPerson1.setName(name);
            goodPerson1.setHelpForMoney(bigDecimalMoney);
        }
        //好友帮忙砍价成功后，需要对好友的砍价金额加到砍价金额的计数器上
        BigDecimal nowTotalMoney = chopUser.getChopMoneyForCount().add(goodPerson1.getHelpForMoney());
        chopUser.setChopMoneyForCount(nowTotalMoney);

        pddDao.addGoodPerson(goodPerson1);

    }

    public ArrayList<GoodPerson> showGoodPerson() {
        return pddDao.findAllGoodPerson();
    }
}
