package com.chenhao.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("2022-4-9\\a.txt");

       /* int b;
        while((b=fr.read())!=-1){
            System.out.println((char)b);
        }*/
        char[] ch = new char[1024];
        int b;
        while((b=fr.read(ch))!=-1){
            System.out.println(new String(ch,0,b));
        }


        fr.close();
    }
}
