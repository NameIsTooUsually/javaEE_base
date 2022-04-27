package com.chenhao.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
双色球规则，双色球每注投注号码由6个1—33的号码和1个1—16的号码组成。
其中6个1-33的数字要求不能重复。请随机生成一注双色球号码。
 */
public class Test6 {
    public static void main(String[] args) {
        //将生成的号码存起来，需要一个数组。
        //定义一个ArrayList数组
        ArrayList<Integer> doubleColorBall = new ArrayList<>();

        Random r = new Random();
        while (doubleColorBall.size() < 7) {
            //随机生成一个数将其存入到数组中
            int luckNum = r.nextInt(33) + 1;//生成一个1-33之间的随机数。
            //如果集合长度小于6时，则此时的随机数需要满足，不能重复，范围在1-33之间
            if (doubleColorBall.size() < 6) {
                boolean flag = false;//假设没有该数字
                for (int i = 0; i < doubleColorBall.size(); i++) {
                    if (luckNum == doubleColorBall.get(i)) {
                        flag = true;
                        break;
                    }
                }
                //循环结束后，对flag进行判断
                if (flag) {
                    //不满足条件，重新生成数字
                    continue;
                } else {
                    //满足条件，将数字存入集合中

                    doubleColorBall.add(luckNum);
                }
            } else {
                //此时集合元素已经有6个，则需要存入最后一个号码，此时需要满足范围在1-16之间
                if (luckNum >= 1 && luckNum <= 16) {
                    //满足条件，将数字存入集合中
                    doubleColorBall.add(luckNum);
                } else {
                    //不满足条件，重新生成数字
                    continue;
                }
            }
        }
        //对双色球号码进行排序
        Integer[] integers = doubleColorBall.toArray(new Integer[doubleColorBall.size()]);
        //将前六位号码进行排序，最后一位特别号不进行排序
        Arrays.sort(integers, 0, doubleColorBall.size() - 1);
        //打印号码
        System.out.println("本期的幸运号码是：");
        for (int i = 0; i < integers.length - 1; i++) {
            System.out.print(integers[i] + " ");
        }
        System.out.println();
        System.out.println("特别号码是");
        System.out.println(integers[integers.length - 1]);
    }
}
