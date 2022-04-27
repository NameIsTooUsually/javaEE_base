package com.chenhao.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
请使用Lambda表达式调用Collections的sort()方法，可以实现对一个`List<String>`集合进行：降序排序。
​	编写main()方法，在main()中按以下步骤编写代码：
​	1. 定义一个`List<String>`集合，并存储以下数据：
​			"cab"
​			"bac"
​			"acb"
​			"cba"
​			"bca"
​			"abc"
	2. 使用Lambda表达式调用Collections的sort()方法对集合进行降序排序。
   	3. 排序后向控制台打印集合的所有元素。
 */
public class Test1 {
    public static void main(String[] args) {
        //创建一个List 集合 使用不可变集合的形式对该集合进行初始化。
        //List<String> list =new ArrayList<>(List.of("cab","bac","acb","cba","bca","abc"));
        List<String> list =new LinkedList<>(List.of("cab","bac","acb","cba","bca","abc"));
        //调用collections中的sort进行排序，用lambda实现降序排序。
        Collections.sort(list,(s1,s2)->{int result = s1.compareTo(s2);
                                            return -result;});
        //打印输出
        System.out.println(list);
    }
}
