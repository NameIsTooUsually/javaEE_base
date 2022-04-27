package com.chenhao.version2;


import com.chenhao.version1.New;

import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        //用户进入程序过后，就加载好新闻
        TreeSet<New> treeSetNew  = loadNews();

        while (true) {
            //直接展示新闻
            showHotNew(treeSetNew);
            System.out.println("输入新闻前面的序号，查看该新闻");
            System.out.println("请选择:>");
            int choice = sc.nextInt();
            New anew = getNew(choice,treeSetNew);
            readNew(anew);
            System.out.println("是否继续阅读");
            System.out.println("1继续  2退出");
            treeSetNew=sortNews(treeSetNew);
            int temp = sc.nextInt();
            if(temp==2){
                break;
            }

        }
    }

    private static TreeSet<New> sortNews(TreeSet<New> treeSetNew) {
        TreeSet<New> sort = new TreeSet<>();
        for (New aNew : treeSetNew) {
            sort.add(aNew);
        }
        return sort;
    }

    private static New getNew(int choice, TreeSet<New> treeSetNew) {
        for (New aNew : treeSetNew) {
            if(choice==aNew.getCount()){
                return  aNew;
            }
        }
        return null;
    }

    //向用户展示热榜
    private static void showHotNew(TreeSet<New> newsMap) {
        System.out.println("==============百度热榜================");
        //
        if(newsMap.size()<10){
            int i=1;
            for (New aNew : newsMap) {
                aNew.setCount(i);
                System.out.println(""+aNew.getCount()+aNew);
                i++;
            }
        }else{
            int i=1;
            for (New aNew : newsMap) {
                if(i>10){
                    break;
                }
                aNew.setCount(i);
                System.out.println(""+aNew.getCount()+aNew);
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
//封装新闻到map集合中
    private static TreeSet<New>  loadNews() {
        TreeSet<New> treeSet = new TreeSet<>();
        //在该方法中封装一个集合，并添加15条新闻
        treeSet.add(new New("上海1.1万例感染者出院会复阳吗热"));
        treeSet.add( new New("广州本轮疫情已报告23例感染者热"));
        treeSet.add( new New("“动态清零”是最佳选择热"));
        treeSet.add( new New("五一放假调休5天 还能跨省出行吗热"));
        treeSet.add( new New("上海昨天核酸检测全部白做？假的新"));
        treeSet.add( new New("男孩坐在狗狗身上排队做核酸"));
        treeSet.add( new New("费列罗称召回事件不波及中国市场"));
        treeSet.add( new New("人贩子盯上乌克兰女孩 120万一个"));
        treeSet.add( new New("俄称炮击阻止亚速营领导人撤离"));
        treeSet.add( new New("一副眼镜7万 奢侈副区长落马"));
        treeSet.add( new New("西安一咖啡店称因影响市貌永久停业"));
        treeSet.add( new New("广州管控区蔬菜包10元一袋新"));
        treeSet.add( new New("男子被确诊艾滋病5年后检测为阴性"));
        treeSet.add( new New("为防藏人 高速出口用上生命探测仪"));
        treeSet.add( new New("上海之后 你需要这样一份囤货指南"));
        return treeSet;
    }
}
