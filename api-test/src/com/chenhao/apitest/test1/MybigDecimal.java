package com.chenhao.apitest.test1;

import java.math.BigDecimal;

public class MybigDecimal {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.8");
        BigDecimal bd2 = new BigDecimal("0.3");

        System.out.println("和为"+bd1.add(bd2));
        System.out.println("差为"+bd1.subtract(bd2));
        System.out.println("积为"+bd1.multiply(bd2));
        //System.out.println("商为"+bd1.divide(bd2));
        System.out.println("商为"+bd1.divide(bd2,2,BigDecimal.ROUND_FLOOR));
        System.out.println("商为"+bd1.divide(bd2,2,BigDecimal.ROUND_HALF_UP));
        System.out.println("商为"+bd1.divide(bd2,2,BigDecimal.ROUND_UP));
    }
}
