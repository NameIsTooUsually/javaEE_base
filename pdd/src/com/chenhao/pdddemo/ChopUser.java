package com.chenhao.pdddemo;

import java.math.BigDecimal;

public class ChopUser {
    //这是一个需要砍价的用户类。里面有用户姓名，砍价金额，总金额。
    private String name;
    private BigDecimal countMinusMoney = new BigDecimal(0);
    private BigDecimal totalMoney;

    public ChopUser() {
    }

    public ChopUser(String name, BigDecimal countMinusMoney, BigDecimal totalMoney) {
        this.name = name;
        this.countMinusMoney = countMinusMoney;
        this.totalMoney = totalMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCountMinusMoney() {
        return countMinusMoney;
    }

    public void setCountMinusMoney(BigDecimal countMinusMoney) {
        this.countMinusMoney = countMinusMoney;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }
}
