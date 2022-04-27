package com.chenhao.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
请编写main()方法，定义一个存储String的集合：`List<String>`，并初始化以下数据：
​			List<String> list = new ArrayList<>();
​			list.add(“迪丽热巴”);
​			list.add(“古力娜扎”);
​			list.add(“周杰伦”);
​			list.add(“蔡徐坤”);
​			//请定义“字符缓冲输出流”BufferedWriter将集合中的数据写入到文件：test3_2.txt中，每个名字一行。
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>(Arrays.asList("迪丽热巴", "古力娜扎", "周杰伦", "蔡徐坤"));
        //创建一个缓冲字符输入流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("2022-4-9\\test3_2.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
            //保证数据尽可能多并且及时的写入
            bw.flush();
        }
        //释放资源
        bw.close();

    }
}
