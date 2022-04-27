package com.chenhao.apitest.test9;
/*
快速排序的思想：
1将数组的第一个数作为基准数。
2从数组右边开始进行比较，如果这个数比基准数大，那么这个数的位置不变，索引数向左移动以为继续比较。
  如果遇到比基准数小的，那么索引数停下来。
3再从左边开始比较，如果这个数比基准数小，那么索引数增加，继续比较。如果这个数比索引数大，那么索引停下来。
4左右两边索引都停下来后，将右边那个比基准小的数和左边这个比基准大的数进行交换。
5当右边的索引等于左边的索引的时候就会推迟循环，这个位置就是基准数的位置
6将基准数放到该位置处。
这样一次递归就完成了

 */
public class QuiteSort {
    public static void main(String[] args) {
        int[] arr = {4,2,5,6,7,8,1,9,3,10};
        quiteSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void quiteSort(int[] arr, int left, int right) {

        int left0 = left;
        int right0 = right;
        int baseNumber = arr[0];
        while(left!=right){
            while(arr[right]>=baseNumber&&left<right){
                right--;
            }
            while(arr[left]<=baseNumber&&left<right){
                left++;
            }
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }
        int temp = arr[left0];
        arr[left0] = arr[left];
        arr[left] = temp;
    }
}
