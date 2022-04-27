package com.chenhao.apitest.test9;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 11;
        int index = binarysearchForIndex(arr,key);
        System.out.println(index);
    }

    private static int binarysearchForIndex(int[] arr, int key) {
        int min = 0;
        int max = arr.length-1;
        while(min<=max){
            int mid = (max+min)/2;
            if(arr[mid]>key){
                max = mid-1;
            }else if(arr[mid]<key){
                min = mid+1;
            }else{
             return mid;
            }
        }
        return -1;
    }

}
