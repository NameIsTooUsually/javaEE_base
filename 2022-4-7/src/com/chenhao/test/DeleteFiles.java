package com.chenhao.test;

import java.io.File;
import java.io.IOException;

public class DeleteFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\chenhao\\aaa\\bbb\\ddd\\ere\\adf");
        boolean mkdirs = file.mkdirs();
        File file1 = new File("D:\\chenhao\\a.txt");
        file1.createNewFile();

        System.out.println(mkdirs);
        File ff = new File("D:\\chenhao");
        deleteTest(ff);
    }

    public static void deleteTest(File file) {
       /* //先进入到需要删除的文件夹中
        File[] fArr = file.listFiles();
        //写一个循环，如果遍历该数组，如果是文件就删除，如果是文件夹就继续
        for (File file1 : fArr) {
            if (file1.isFile()) {
                file1.delete();
            } else {
                deleteTest(file1);
            }
        }
        file.delete();*/


        if(file.listFiles()==null||file.listFiles().length==0){
            file.delete();
            return;
        }
        File[] farr = file.listFiles();
        for (int i = 0; i < farr.length; i++) {
            deleteTest(farr[i]);
        }
       // file.delete();

    }
}
