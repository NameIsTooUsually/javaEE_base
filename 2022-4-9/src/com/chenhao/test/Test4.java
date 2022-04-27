package com.chenhao.test;

import java.io.FileWriter;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("2022-4-9\\a.txt");

        fw.write("当你看完这句话的时候，你就看完了一句话");
        //fw.write(97);
        //fw.write(new char[]{97,98,99,100,101});
        //fw.write(new char[]{97,98,99,100,101},2,3);
        //fw.write("当你看完这句话的时候，你就看完了一句话",4,6);
        fw.close();
    }
}
