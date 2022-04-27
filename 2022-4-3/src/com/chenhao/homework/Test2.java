package com.chenhao.homework;
import java.util.HashMap;
import java.util.HashSet;
/*
有以下字符串：
​ String str = “fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew”;
​请编程统计每个字符出现的次数
 */
public class Test2 {
    public static void main(String[] args) {
        //先将字符串转换成一个字符数组
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        char[] chars = str.toCharArray();
        //创建HashMap集合，存储每一个字符。将字符作为键。字符出现的次数作为值（值的默认值是1）
        //这样如果出现重复的字符，可以将值加1，统计值出现的次数
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if(hashMap.containsKey(chars[i])){
                Integer integer = hashMap.get(chars[i]);
                integer++;
                hashMap.put(chars[i],integer);
            }else{
                hashMap.put(chars[i],1);
            }
        }
        hashMap.forEach((Character c,Integer i)->{
            System.out.println(c+"出现了"+i+"次");
        });
        /*
        做法比较繁琐，需要修改
        char[] charArr = str.toCharArray();
        //创建一个HashSet进行去重
        HashSet<Character> charSet = new HashSet<>();
        for (int i = 0; i < charArr.length; i++) {
            //将字符数组中的每个值存入HashSet中。根据Set的特性，可以将重复的字符去除
            charSet.add(charArr[i]);
        }

        //再取出sharSet中的每一个元素进行与 字符数组进行遍历，如果出现相同的字符计数器加加
        //创建一个hashmap 存储遍历的结果,key为 字符，value为出现的次数
        HashMap<Character,Integer> resultMap = new HashMap<>();

        for (Character character : charSet) {
            //每次个字符进行排查是计数器都清零
            int count = 0;
            for (int i= 0; i < charArr.length; i++) {
                if(character==charArr[i]){
                    count++;
                }
            }
            resultMap.put(character,count);
        }
        resultMap.forEach((key,value)->{
            System.out.println(key+"出现了"+value+"次");
        });*/
    }
}
