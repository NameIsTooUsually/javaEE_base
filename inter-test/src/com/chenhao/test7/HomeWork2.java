package com.chenhao.test7;

import java.util.Scanner;

/*
1. 声明函数式接口，接口中声明抽象方法，`public String getValue(String str);`

2. 声明类`TestLambda`，类中编写方法使用接口作为参数，将一个字符串转换成大写，
   并作为方法的返回值。
 */
public class HomeWork2 {
    public static void main(String[] args) {
        //通过键盘录入一个祖字符串
        Scanner sc = new Scanner(System.in);
        //创建TestLambda 对象
        TestLambda2 testLambda = new TestLambda2();

        System.out.println("请输入一个长度大于5的字符串");
        String str = sc.next();//录入需转换成大写的字符串
        //通过对象调方法。方法中有两个参数，一个参数为接口类型，并且该接口中只有一个抽象方法。可以使用Lambda形式；
        //另一个参数正常传进去
        String result = testLambda.method((targetStr)->{ return targetStr.substring(1,str.length()-1);},str);
        System.out.println(result);
    }
}
@FunctionalInterface
interface HomeWorkInter2{
    public String getValue(String str);
}

class TestLambda2{
    public String method(HomeWorkInter homeWorkInter,String targetStr){
        //返回接口中方法的返回值
        return homeWorkInter.getValue(targetStr);
    }
}