package com.chenhao.apitest.test9;

public class Test {
    public static void main(String[] args) {
        //用递归方法求5的阶乘。
        System.out.println(multiply(20));
    }
    public static int multiply(int n){
        if(1==n){
            return n;
        }else{
            return n*multiply(n-1);
        }
    }
}
