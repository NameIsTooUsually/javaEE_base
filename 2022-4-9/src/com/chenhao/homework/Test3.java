package com.chenhao.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
请编写main()方法，定义一个字符缓冲输入流BufferedReader，读取test3_2.txt文件，
一次读取一行，将读取的内容存储到一个List<String>集合中，遍历、并打印集合中的每个元素：
​			//1.定义一个字符缓冲输入流
​			BufferedReader in = new BufferedReader(......);
​			//2.定义一个集合
​			List<String> list = new ArrayList<>();
​			//3.一次读取一行
​			......
​			......
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        //创建一个缓冲字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("2022-4-9\\test3_2.txt"));
        //定义一个集合
        List<String> list = new ArrayList<>();

       String s;
       while( (s=br.readLine())!=null){
           list.add(s);
       }
       //释放资源
       br.close();
       //遍历并打印
        for (String s1 : list) {
            System.out.println(s1);
        }

    }
}
