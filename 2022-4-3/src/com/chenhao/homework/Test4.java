package com.chenhao.homework;

import java.util.Arrays;

/*
 请按以下要求顺序编写程序：
l  定义测试类，定义main()方法；
l  定义以下数组：
int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};
l  用Arrays类打印此数组的所有元素；
l  用“冒泡排序”对数组元素“升序”排序；打印排序后的数组。
 */
public class Test4 {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};
        //将数组转换成字符串形式，然后打印
        String s = Arrays.toString(arr);
        System.out.println(s);

        //冒泡排序
        //外层循环表示有多少元素需要交换
        for (int i = 0; i < arr.length-1; i++) {
            //内层循环表示每次循环需要交换的次数
            for (int j = 0; j < arr.length-1-i; j++) {
                //进行判断，将当前数组元素j与下一个元素j+1进行比较，如果j>j+1,则将它们交换位置
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //打印数组
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.println(arr[i]+"]");
            }else{
                System.out.print(arr[i]+", ");

            }
        }
    }
}
