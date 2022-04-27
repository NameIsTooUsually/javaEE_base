package com.chenhao.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
请编写main()方法，定义一个字符缓冲输入流BufferedReader对象，
读取”test3_4.txt”文件，一次读取一行，将每行数据封装为一个Student对象，
并将Student对象存储到一个集合。遍历并打印集合的所有Student信息。
​		//定义一个BufferedReader对象
​		BufferedReader in = new BufferedReader(......);
​		//定义一个集合
​		List<Student> stuList = new ArrayList<>();
​		//一次读取一行
​		......
 */
public class Test5 {
    public static void main(String[] args) throws IOException {
        //定义一个集合
        List<Student> stuList = new ArrayList<>();
        //创建一个缓冲字符输入流对象
        BufferedReader bw = new BufferedReader(new FileReader("2022-4-9\\test3_4.txt"));
        //读取文件中内容，一次读取一行
        String s ;
        while((s=bw.readLine())!=null){
            //对读取的文件进行切割
            String[] split = s.split(" , ");
            //封装到学生信息并存入数组中
            stuList.add(new Student(split[0],split[1],Integer.parseInt(split[2]),Integer.parseInt(split[3])));
        }
        //释放资源
        bw.close();
        //遍历并打印
        for (Student student : stuList) {
            System.out.println(student.toString());
        }
    }
}
