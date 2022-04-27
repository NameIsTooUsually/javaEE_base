package com.chenhao.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\chenhao\\123");
        boolean mkdirs = file1.mkdir();
        //boolean newFile = file1.createNewFile();

        System.out.println(mkdirs);

    }
}
