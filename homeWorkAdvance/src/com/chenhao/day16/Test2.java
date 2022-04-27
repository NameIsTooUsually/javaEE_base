package com.chenhao.day16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        //创建文件输出对象
        FileOutputStream fos = new FileOutputStream("homeWorkAdvance\\src\\com\\chenhao\\day16\\Info.txt");
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("录入信息");
            String str = sc.next();
            if("886".equals(str)){
                break;
            }
            //将键盘录入的字符串写到文件中去
            fos.write(str.getBytes());
            //换行
            fos.write("\r\n".getBytes());
            //刷新
            fos.flush();
        }
        //关闭资源
        fos.close();
    }
}
