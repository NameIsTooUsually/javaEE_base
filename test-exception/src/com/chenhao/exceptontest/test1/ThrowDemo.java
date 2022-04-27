package com.chenhao.exceptontest.test1;

public class ThrowDemo {
    public static void main(String[] args) {
        //int[]  arr = {1,2,3,4,5};

        try {
            int[]  arr = null;
            method(arr);
        } catch (Exception e) {
            System.out.println("我竟然异常了");
        }


    }

    public  static void method(int[] arr) {
        if(null==arr){
            throw new NullPointerException("这里还可以写东西");
        }else{
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
