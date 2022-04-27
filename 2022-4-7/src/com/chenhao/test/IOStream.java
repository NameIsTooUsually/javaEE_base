package com.chenhao.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream outPut = new FileOutputStream("D:\\a.txt");
        int[] arr ={1,2,3,4,5};
        outPut.write(new byte[]{97,98,99,100,101,102},2,4);
        //outPut.close();
    }
}
