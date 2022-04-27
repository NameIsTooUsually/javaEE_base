package com.chenhao.quiteSort;

public class QuiteDemo {
    public static void main(String[] args) {
        //快速排序
        //基本思想 确定一个基准数，通过遍历将数组中比这个数大的都放在数组的右边，比这个数小的都放在左边。
        //再通过递归的思想，重复该步骤。最终就能对数组进行排序

        //1定义一个无序的数组
        final int Max = 15000;

        int[] arr = new int[Max];
        int[] arr1 = new int[Max];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=Max-i;
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=Max-i;
        }

        int left = 0;
        int right = arr.length - 1;
        //2调用排序方法
        long l1 = System.currentTimeMillis();
        myQuiteSort(arr, left, right);
        long l2 = System.currentTimeMillis();



        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();


        long l3 = System.currentTimeMillis();
        myBubbleSort(arr1);
        long l4 = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i] + " ");
        }

        System.out.println();

        System.out.println("快速排序"+(l2-l1));
        System.out.println("冒泡排序"+(l4-l3));

    }

    //快速排序方法
    private static void myQuiteSort(int[] arr, int left, int right) {
        if(right<left){
            return;
        }
        int left0 = left;
        int right0 = right;
        //定义基准数
        int baseNum = arr[left0];

        //从数组的右边开始进行比较，如果找到比基准数小的就停下来。
        //如果没有找到，就向左一定以为然后继续比较。
        while (left != right) {
            //从右边开始查找，当循环结束时，就是找到了比基准数小的数，或者left==right了
            while (arr[right] >= baseNum && right > left) {
                right--;
            }

            //从左边开始查找，当循环结束时，就是找到了比基准数大的数，或者left==right了
            while (arr[left] <= baseNum && left < right) {
                left++;
            }

            //此时将left 和 right 进行交换
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //当left==right时结束循环，说明左边右边已经指向同一个数了，而且这个数比基准数小
        //此时进行基准数归位
        int temp = arr[left0];
        arr[left0] = arr[right];
        arr[right] = temp;
       //
        myQuiteSort(arr,left0,left-1);
        myQuiteSort(arr,left+1,right0);

    }

    public static void myBubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
