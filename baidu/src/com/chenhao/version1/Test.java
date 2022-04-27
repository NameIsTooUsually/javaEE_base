package com.chenhao.version1;


import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //用户进入程序过后，就加载好新闻
        HashMap<Integer, New> newsMap = optionalNew();
        loop:
        while (true) {
            //向用户展示菜单列表，用户根据展示的内容进行选择
            //根据用户选择向用户展示相应内容
            shouMenu();
            System.out.println("请选择:>");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("查看新闻");
                    //打印新闻列表
                    //showNews();
                    //用户会根据展示的列表进行选取
                    showHotNew(newsMap);
                    System.out.println("输入新闻前面的序号，查看该新闻");
                    int ch = sc.nextInt();
                    //通过用户的选择选择，key查找value。得到该条新闻的对象

                    New aNew = newsMap.get(ch);
                    //接下来向用户展示该新闻，并且让用户进行，点赞、评论、收藏的操作
                    readNew(aNew);
                    break;
                /*case "2":
                   // System.out.println("显示热榜");
                    //向用户展示热榜，根据进行，点赞、评论、收藏的量进行排序
                    showHotNew(newsMap);


                    break;*/
                case "3":
                    System.out.println("退出程序");

                    break loop;
                default:
                    System.out.println("您的输入有误，请检查后重新输入");
                    break;
            }
        }
        //创建一个ArrayList 集合 封装新闻
        //ArrayList<New> newsList = new ArrayList<>();
        //addNews(newsList);


    }
//向用户展示热榜
    private static void showHotNew(HashMap<Integer, New> newsMap) {
        //将新闻信息拿出来，存储到一个TreeSet中（可以实现排序），然后打印输出前十个。
        TreeSet<New> treeSet = new TreeSet<>();
        for (Map.Entry<Integer, New> entry : newsMap.entrySet()) {
            treeSet.add(entry.getValue());
        }

        if(treeSet.size()<10){
            int i=1;
            for (New aNew : treeSet) {
                System.out.println(""+i+aNew);
                i++;
            }
        }else{
            int i=1;
            for (New aNew : treeSet) {
                if(i>10){
                    break;
                }
                System.out.println(""+i+aNew);
                i++;
            }
        }

    }

    //用户阅读新闻
    private static void readNew(New aNew) {
        //想用户展示该新闻信息，并其实用户进行操作
        System.out.println(aNew.getNewMessage());
        System.out.println("1点赞 2评论 3收藏 ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int temp;
        switch (choice){
            case 1:
                 temp = aNew.getLike();
                 if(temp==0){
                     aNew.setLike(1);
                 }else{
                     aNew.setLike(temp+1);
                 }
                break;
            case 2:
                temp = aNew.getComment();
                if(temp==0){
                    aNew.setComment(1);
                }else{
                    aNew.setComment(temp+1);
                }
                break;
            case 3:
                temp = aNew.getCollection();
                if(temp==0){
                    aNew.setCollection(1);
                }else{
                    aNew.setCollection(temp+1);
                }
                break;
            default:
                System.out.println("选择错误");
        }
    }

    //将所有新闻向用户展示出来
    /*private static void showNews() throws IOException {
        //创建缓冲输入流对象，通过该对象读取新闻标题，想用户展示
        BufferedReader br = new BufferedReader(new FileReader("baidu\\new.txt"));
        String s;
        while ((s = br.readLine()) != null) {
            //循环遍历，向用户展示
            System.out.println(s);
        }
        //关闭流，释放资源
        br.close();

    }*/
//显示选择菜单
    private static void shouMenu() {
        System.out.println("==========================");
        System.out.println("==       1查看新闻      ==");
        //System.out.println("==       2显示热榜      ==");
        System.out.println("==       3退出程序      ==");
        System.out.println("==========================");


    }
//封装新闻到map集合中，用户可以
    private static HashMap<Integer, New> optionalNew() {
        HashMap<Integer, New> hashMap = new HashMap<>();
        //在该方法中封装一个数组，并添加15条新闻
        hashMap.put(1, new New("上海1.1万例感染者出院会复阳吗热"));
        hashMap.put(2, new New("广州本轮疫情已报告23例感染者热"));
        hashMap.put(3, new New("“动态清零”是最佳选择热"));
        hashMap.put(4, new New("五一放假调休5天 还能跨省出行吗热"));
        hashMap.put(5, new New("上海昨天核酸检测全部白做？假的新"));
        hashMap.put(6, new New("男孩坐在狗狗身上排队做核酸"));
        hashMap.put(7, new New("费列罗称召回事件不波及中国市场"));
        hashMap.put(8, new New("人贩子盯上乌克兰女孩 120万一个"));
        hashMap.put(9, new New("俄称炮击阻止亚速营领导人撤离"));
        hashMap.put(10, new New("一副眼镜7万 奢侈副区长落马"));
        hashMap.put(11, new New("西安一咖啡店称因影响市貌永久停业"));
        hashMap.put(12, new New("广州管控区蔬菜包10元一袋新"));
        hashMap.put(13, new New("男子被确诊艾滋病5年后检测为阴性"));
        hashMap.put(14, new New("为防藏人 高速出口用上生命探测仪"));
        hashMap.put(15, new New("上海之后 你需要这样一份囤货指南"));
        return hashMap;
    }
}
