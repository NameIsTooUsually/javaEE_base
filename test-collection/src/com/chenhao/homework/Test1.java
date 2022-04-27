package com.chenhao.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
请定义一个Collection类型的集合，存储以下字符串：
​              “JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，
​              ”Java架构师之路”
​       请编程实现以下功能：
Ø  使用迭代器遍历所有元素，并打印
Ø  使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
Ø  使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
Ø  如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
​       (注意：以上功能写在一个main()方法中，但请单独实现)
 */
public class Test1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("JavaEE企业级开发指南");
        list.add("Oracle高级编程");
        list.add("MySQL从入门到精通");
        list.add("Java架构师之路");

        //methdo1(list);
        //method2(list);
        //method3(list);
        //method4(list);

    }
//Ø  如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
    public static void method4(Collection<String> list) {
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String result = it.next();
            if(result.contains("Oracle")){
                it.remove();
            }
        }
        System.out.println(list);
    }

    //Ø  使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
    public static void method3(Collection<String> list) {
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
        String result = it.next();
        if(result.contains("Java")){
            System.out.println(result);
        }
    }
    }


    //Ø  使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
    public static void method2(Collection<String> list) {
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String result = it.next();
            if(result.length()<10){
                System.out.println(result);
            }
        }
    }

    //Ø  使用迭代器遍历所有元素，并打印
    public static void methdo1(Collection<String> list) {
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
