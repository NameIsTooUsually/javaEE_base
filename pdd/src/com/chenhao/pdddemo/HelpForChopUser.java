package com.chenhao.pdddemo;

import java.math.BigDecimal;

public class HelpForChopUser {
    private String name;
    private BigDecimal chopMoney = new BigDecimal(0);

    public HelpForChopUser() {
    }

    public HelpForChopUser(String name, BigDecimal chopMoney) {
        this.name = name;
        this.chopMoney = chopMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getChopMoney() {
        return chopMoney;
    }

    public void setChopMoney(BigDecimal chopMoney) {
        this.chopMoney = chopMoney;
    }
}
