package com.chenhao.bigdecimal;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal big1 = new BigDecimal(0);
        BigDecimal big2 = new BigDecimal(100);

        System.out.println(big1.compareTo(big2));
    }
}
