package com.chenhao.test;

import java.io.File;
import java.util.ArrayList;

public class Demo2 {

    public static void main(String[] args) {

        /*File file2 = new File("D:\\多级目录");
        GetSum getSum = new GetSum();
        Long getsum = 0L;
        getFilesSize(getSum, file2);
        System.out.println("file2的大小" + getSum.getSum());*/

        ArrayList<GetSum> arrayList = new ArrayList<>();
        arrayList.add(new GetSum(0));
        arrayList.add(new GetSum(1));
        arrayList.add(new GetSum(2));
        arrayList.add(new GetSum(3));
        arrayList.add(new GetSum(4));

        for (GetSum sum : arrayList) {
            if(sum.getSum()==3){
                sum.setSum(6);
            }
        }
        System.out.println(arrayList);
    }

    public static void getFilesSize(GetSum getSum, File file) {
        /*File[] filesArr = file.listFiles();
        //对文件中的元素进行遍历，如果是文件则直接计算它的大小
        for (File file1 : filesArr) {
            if (file1.isFile()) {
                //getsum += file1.length();
                long temp =getSum.getSum()+file1.length();
                getSum.setSum(temp);
            } else {
                getFilesSize(getSum, file1);
            }
        }
        System.out.println(getSum.getSum());*/




    }
}
class GetSum{
    long sum = 0;

    public GetSum() {
    }

    @Override
    public String toString() {
        return "GetSum{" +
                "sum=" + sum +
                '}';
    }

    public GetSum(long sum) {
        this.sum = sum;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
}
