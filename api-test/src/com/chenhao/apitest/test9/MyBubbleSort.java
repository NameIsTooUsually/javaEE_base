package com.chenhao.apitest.test9;

public class MyBubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5};
        int[] arrresult = myBubbleSort(arr);
        for (int i = 0; i < arrresult.length; i++) {
            System.out.print(arrresult[i]+" ");
        }
        System.out.println();
    }

    private static int[] myBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
