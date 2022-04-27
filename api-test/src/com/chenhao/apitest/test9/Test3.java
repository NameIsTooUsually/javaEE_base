package com.chenhao.apitest.test9;

import java.math.BigDecimal;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
    /*    int sum = add(100);
        System.out.println(sum);
    }

    private static int add(int i) {
        if(1==i){
            return i;
        }else{
           return i+add(i-1);
        }*/
        BigDecimal one = new BigDecimal(0);
        Random r = new Random();
        double result = r.nextDouble();
        String str = result + "";
        BigDecimal bigDecimal = new BigDecimal(str);
        bigDecimal = bigDecimal.divide(new BigDecimal(1), 2, BigDecimal.ROUND_HALF_UP);
        bigDecimal = bigDecimal.multiply(new BigDecimal(10));
        System.out.println(bigDecimal);
        double money = bigDecimal.doubleValue();
        one = bigDecimal;
        System.out.println(one);


    }
}
