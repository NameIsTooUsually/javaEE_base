package com.chenhao.apitest.test2;

public class StringLearn {
    public static void main(String[] args) {
        String str = "91 27 46 38 50";
        String[] arrStr = str.split(" ");
        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i]= Integer.parseInt(arrStr[i]);
        }
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
    }
}
