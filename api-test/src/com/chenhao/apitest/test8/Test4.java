package com.chenhao.apitest.test8;


/*
程序模拟一个论坛发帖的过程，请用户输入一个发帖内容，例如：
		“积分看电视普京了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记普京”
	请定义一个关键字数组：
		String[] keyArray = {“特朗普”,”普京”};
	请将字符串中包含的数组中的关键字替换为*符号。

 */
public class Test4 {
    public static void main(String[] args) {
        String comment = "积分看电视普京了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记普京";
        String[] keyArray = {"普京", "特朗普"};
        String commentNew = comment.replace(keyArray[0], "***").replace(keyArray[1], "**");
        System.out.println(commentNew);
    }

}
