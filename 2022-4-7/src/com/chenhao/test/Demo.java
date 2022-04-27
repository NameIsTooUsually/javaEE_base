package com.chenhao.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\测试目录\\新建 文本文档.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(89);

    }

}
