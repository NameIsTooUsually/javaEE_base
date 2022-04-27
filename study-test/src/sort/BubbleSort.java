package sort;

public class BubbleSort {
    public static void main(String[] args) {
        //创建一个无序的int类型数组
        int[] arr = {5, 1, 2, 3, 8, 7, 4, 11, 9, 6};

        //bubble(arr);

        quitesort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubble(int[] arr) {
        //冒泡排序基本思路，第n个数与n+1个数进行比较，如果n大，则进行交换，如果n小则不进行交换。
        // 然后n++；++后重复刚才的比较操作。这样一次操作下来，能将最大的数放到最后，下一次操作
        // 时最后一个数就不用再比较了。
        for (int i = 0; i < arr.length - 1; i++) {
            //外层循环控制循环的次数（每次能给一个最大值放到后面，所以只循环数组个数减一次）
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //内存循环控制交换次数，n个数 比较n-1次就可以了

                if (arr[j] > arr[j + 1]) {
                    //J>J+1就进行交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void quitesort(int[] arr, int left, int right) {
         /*
        快速排序
        快速排序用到了递归的思想，每一次确定一个基准数，将比基准数大的数都放在基准数的右边，比基准数小的数都放在基准数的左边
        这样能确定基准数在 正确顺序中的位置，循环多次这样就能确定每个数的位置，就能实现排序
         */
        if (right <= left) {
            return;
        }
        //先确定一个基准数，每次一第一个数为基准数
        int base = arr[left];
        //        //记住left 和right的值
        int left0 = left;
        int right0 = right;
        //int[] arr = {5, 1, 2, 3, 8, 7, 4, 11, 9, 6};
        while (left < right) {
            //从右边开始比较，如果这个数比基准数大，那就比较下一个数，如果这个数比基准数小，那就停在这里
            while (true) {
                if (arr[right] >= base && right > left) {
                    right--;
                } else {
                    break;
                }
            }
            //开始比较左边，如果这个数比基准数小，就比较下一个数，如果这个数比基准数大，就在这里。
            while (true) {
                if (arr[left] <= base && left < right) {
                    left++;
                } else {
                    break;
                }
            }
            //当两次循环都结束时，左右索引停的位置代表的数进行交换，这样可以将比基准数大的数和比基准数小的数进行交换
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //让基准数进行归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

        //此时基准数已经归位，则基准数左边的数都比基准数小，基准数右边的数都比基准数大。这是只用在对基准数左边
        // 和基准数右边再进行以上的方法就可以了
        quitesort(arr, left0, left - 1);
        quitesort(arr, left + 1, right0);

    }
}
