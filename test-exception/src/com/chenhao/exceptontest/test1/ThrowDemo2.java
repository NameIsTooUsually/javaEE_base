package com.chenhao.exceptontest.test1;

public class ThrowDemo2 {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println();
            e.printStackTrace();
        }

        System.out.println("测试执行的顺序");
    }
}
