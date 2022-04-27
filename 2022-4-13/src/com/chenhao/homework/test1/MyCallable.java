package com.chenhao.homework.test1;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    /*
    使用线程池,分别开启三条线程,生成10个1到100的随机数,
    然后计算他们的平均数, 最后计算这三个平均数的平 均数.(使用Callable)
     */
    @Override
    public Object call() throws Exception {


        return getBigDecimal();
    }

    public BigDecimal getBigDecimal() {
        //创建一个随机数对象
        Random r = new Random();
        //创建一个数组用来存储随机数
        int[] arr = new int[10];
        //生成随机数，依次往数组中放
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100)+1;
        }
        //创建一个BigDecimal对象，用来存储数组中各个数的和
        BigDecimal sum = new BigDecimal(0);
        for (int i : arr) {
            sum = sum.add(new BigDecimal(i));
        }
        sum = sum.divide(new BigDecimal(arr.length),2,BigDecimal.ROUND_HALF_UP);
        return sum;
    }
}
