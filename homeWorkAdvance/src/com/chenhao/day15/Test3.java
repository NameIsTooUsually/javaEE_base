package com.chenhao.day15;
/*
需求：使用递归，计算斐波拉契数列的第n项的值. 斐波拉契数列是：1、1、2、3、5、8、13、21、34……
​	其中，从第三项起，每一项都是前两项的和。
 */
public class Test3 {
    public static void main(String[] args) {
        int n = 10;
        int num = getNum(n);
        System.out.println(num);
    }

    private static int getNum(int n) {
        if(n<=2){
            return 1;
        }
        return getNum(n-1)+getNum(n-2);

    }
}
