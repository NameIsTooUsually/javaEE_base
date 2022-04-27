package com.chenhao.pdd2.dao;

import com.chenhao.pdd2.domain.GoodPerson;

import java.util.ArrayList;

public class PddDao {
    private static ArrayList<GoodPerson> goodPersonArr = new ArrayList<>();
    //传递帮忙砍价用户数组
    public ArrayList<GoodPerson> findAllGoodPerson() {
        return goodPersonArr;
    }

    public void addGoodPerson(GoodPerson goodPerson1) {
        goodPersonArr.add(goodPerson1);
    }
}
