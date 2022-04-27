package com.chenhao.homework.test2;

import org.junit.Test;

/*
 请定义测试方法，测试getMax()方法
 */
public class ArrayUtils {
    @Test
    public void test(){
        int[] arr = {1,2,3,4,5,6,7};
        int max = getMax(arr);
        System.out.println("最大值为:"+max);
    }
    public int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1 ;i < arr.length ; i++){
            max = arr[i] > max ? arr[i] : max;
        }
        return max;
    }
}
