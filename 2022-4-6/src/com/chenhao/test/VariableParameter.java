package com.chenhao.test;


import java.util.ArrayList;
import java.util.List;

//可变参数的简单使用
public class VariableParameter {
    public static void main(String[] args) {
        int sum = sum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sum);
        ArrayList<String> arrayList = new ArrayList<>(List.of("a","b","c"));
    }
    public static int sum(int...a){
        int temp = 0;
        for (int i = 0; i < a.length; i++) {

            temp+=a[i];
        }
        return temp ;
    }
}
