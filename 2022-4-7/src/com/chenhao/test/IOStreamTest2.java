package com.chenhao.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamTest2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("2022-4-7\\a.txt");
        f.write("当你看到这句话的时候，说明你已经看了这句话\r\n".getBytes());
        f.close();
        FileOutputStream f1 = new FileOutputStream("2022-4-7\\a.txt",true);
        f1.write("没错，我又在这个文件中写数据了，那你又看完了".getBytes());
        f1.close();
    }
}
