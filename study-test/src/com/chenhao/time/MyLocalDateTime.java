package com.chenhao.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

public class MyLocalDateTime {
    public static void main(String[] args) {
       /* LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));
        LocalDateTime localDateTime1 = localDateTime.withDayOfYear(200);
        System.out.println(localDateTime1.format(dateTimeFormatter));*/

        ArrayList<String > arrayList = new ArrayList<>();
        arrayList.add("c");
        arrayList.add("b");
        arrayList.add("a");
        ArrayList<String > arrayList1 = new ArrayList<>();



        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr1 = {1,2,3,4,5};
        System.arraycopy(arr,4,arr1,0,5);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println(Objects.toString(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(Objects.toString(arrayList));

    }
}
