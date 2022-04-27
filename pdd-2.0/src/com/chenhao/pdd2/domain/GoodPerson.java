package com.chenhao.pdd2.domain;

import java.math.BigDecimal;

public class GoodPerson {
    private String name;
    private BigDecimal helpForMoney;

    public GoodPerson() {
    }

    public GoodPerson(String name, BigDecimal helpForMoney) {
        this.name = name;
        this.helpForMoney = helpForMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getHelpForMoney() {
        return helpForMoney;
    }

    public void setHelpForMoney(BigDecimal helpForMoney) {
        this.helpForMoney = helpForMoney;
    }
}
