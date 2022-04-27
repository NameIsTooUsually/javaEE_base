package com.chenhao.quiteSort;

public class QuiteDemo1 {
    public static void main(String[] args) {
        /*
        简单实现快速排序，快速排序运用到的是递归的思想。
        基本思路为：创建一个方法，确定一个基准数，将比基准数大的值放到基准数左边
                    比基准数小的值放到基准数右边。
                    然后再通过递归实现对整个数组的排序。
         */
        //定义一个无序的数组
        int[] arr = {7, 3, 4, 8, 2, 9, 5, 6, 1, 10};

        int left = 0;
        int right = arr.length - 1;

        quiteSort(arr, left, right);
        //打印数组进行查看
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quiteSort(int[] arr, int left, int right) {
        //记住左右的索引。确定基准数
        if (left > right) {
            return;
        }
        int left0 = left;
        int right0 = right;
        int baseNum = arr[left];
        //外层循环：通过多次的循环查找，最终可以对每个数都与基准数进行比较，
        while (true) {
            //先从右边开始查找，如果这个数比基准数大，则索引减减，继续寻找前一个。
            //如果这个数比基准数小，则停止查找，让索引指向该数
            while (arr[right] >= baseNum && right > left) {//停止循环的条件为该数比基准数小
                right--;
            }
            //从右查找停止后，再从左开始查找，如果这个数比基准数小。则索引加加，继续寻找下一个
            //如果这个数比基准数大，则停止查找，让索引指向该数

            while (arr[left] <= baseNum && right > left) {
                left++;
            }
            //此时左右两边都停下来了，将left索引和right索引指向的数进行互换
            if (right == left) {
                break;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        //最外层循环结束后，也就是left==right; 并且该处的数是小于基准数的（先从右侧开始查找的，右侧先停下来）
        //此时进行基准数归位操作，将基准数与该处的的数进行互换
        int temp = arr[left0];
        arr[left0] = arr[left];
        arr[left] = temp;
        //运行至该处时，就实现了基准数左边的数都小于等于基准数，基准数右边的数大于等于基准数。
        //通过递归的思想
        quiteSort(arr, left0, left - 1);
        quiteSort(arr, right + 1, right0);

    }
}
