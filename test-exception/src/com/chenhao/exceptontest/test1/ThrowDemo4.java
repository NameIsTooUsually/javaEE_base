package com.chenhao.exceptontest.test1;

public class ThrowDemo4 {
    public static void main(String[] args) {
        while(true){
            try {
                int[] arr = {1,2,3};

                System.out.println(arr[5]);
                break;
            } catch (Exception e) {
                System.out.println("异常");
                continue;
            }


        }
    }
}
