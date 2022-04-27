package com.chenhao.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("2022-4-7\\aaa\\abc.txt");
        /*if (!file.exists()) {
            file.mkdirs();
        }*/
        //File file1 = new File(file, "abc.txt");

        //file1.createNewFile();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        FileOutputStream fos = new FileOutputStream("2022-4-7\\bbb\\abc.txt");
        System.out.println(fos);
        play();

    }
    public static void play(){
        throw new RuntimeException();
    }
}
