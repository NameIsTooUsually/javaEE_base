package com.chenhao.pdd2.domain;

import java.math.BigDecimal;
import java.util.Random;

public class ChopUser {
    private String name;
    private BigDecimal ChopMoneyForTotal;
    private BigDecimal ChopMoneyForCount = new BigDecimal(0);
    private  int Hard;//难度表示用户最多需要多少次砍价成功。
    private  int countChop;

    public int getCountChop() {
        return countChop;
    }

    public void setCountChop(int countChop) {
        this.countChop = countChop;
    }

    public ChopUser(String name, BigDecimal chopMoneyForTotal, BigDecimal chopMoneyForCount) {
        this.name = name;
        ChopMoneyForTotal = chopMoneyForTotal;
        ChopMoneyForCount = chopMoneyForCount;
        setHard();
    }

    public ChopUser() {
        setHard();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getChopMoneyForTotal() {
        return ChopMoneyForTotal;
    }

    public void setChopMoneyForTotal(BigDecimal chopMoneyForTotal) {
        this.ChopMoneyForTotal = chopMoneyForTotal;
    }

    public BigDecimal getChopMoneyForCount() {
        return ChopMoneyForCount;
    }

    public void setChopMoneyForCount(BigDecimal chopMoneyForCount) {
        ChopMoneyForCount = chopMoneyForCount;
    }

    public int getHard() {
        return Hard;
    }

    private  void setHard() {
        Random r = new Random();
        Hard = r.nextInt(5)+15;
    }

}
