package com.chenhao.test;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File dirs = new File("2022-4-7\\aaa");
        if(!dirs.exists()){
            boolean mkdirs = dirs.mkdirs();
            System.out.println(mkdirs);
        }
        File file = new File(dirs,"a.txt");
        file.createNewFile();
    }
}
