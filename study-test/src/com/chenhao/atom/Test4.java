package com.chenhao.atom;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*
完成如上百度热榜展示功能接口，查询排行前10的热点新闻。
需求分析：
1.查询新闻表中新闻数据。
2.根据不同分值比列进行分值计算，然后排序。取前10名。分值计算参考：
3.实时更新热度榜单排行
 */
public class Test4 {
    public static void main(String[] args) {
        //创建一个Treeset
        TreeSet<News> news = new TreeSet<>();
        //添加新闻
        news.add(new News("上海1.1万例感染者出院会复阳吗热"));
        news.add(new News("广州本轮疫情已报告23例感染者热"));
        news.add(new News("“动态清零”是最佳选择热"));
        news.add(new News("五一放假调休5天 还能跨省出行吗热"));
        news.add(new News("上海昨天核酸检测全部白做？假的新"));
        news.add(new News("男孩坐在狗狗身上排队做核酸"));
        news.add(new News("费列罗称召回事件不波及中国市场"));
        news.add(new News("人贩子盯上乌克兰女孩 120万一个"));
        news.add(new News("俄称炮击阻止亚速营领导人撤离"));
        news.add(new News("一副眼镜7万 奢侈副区长落马"));
        news.add(new News("西安一咖啡店称因影响市貌永久停业"));
        news.add(new News("广州管控区蔬菜包10元一袋新"));
        news.add(new News("男子被确诊艾滋病5年后检测为阴性"));
        news.add(new News("为防藏人 高速出口用上生命探测仪"));
        news.add(new News("上海之后 你需要这样一份囤货指南"));
        //向用户展示新闻
       while(true){
           show(news);
       }
    }

    private static void show(TreeSet<News> news) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======百度热榜======");
        for (News news1 : news) {
            System.out.println(news1);
        }
        //给出提示让用户输入标题进行阅读
        System.out.println("请输入新闻标题");
        String title = sc.nextLine();
        //根据用户输入的标题，让用户进行点赞评论和收藏
        System.out.println("1 点赞  2 评论  3 收藏");
        String result = sc.nextLine();

        //根据用户输入去匹配相关新闻
        Iterator<News> iterator = news.iterator();
        News newsOld = null;
        while(iterator.hasNext()){
            newsOld = iterator.next();
            if(newsOld.getTitle().equals(title)){
                //将该新闻移除集合，重新添加这样才能排序
                iterator.remove();
                break;
            }
        }
        //根据用户输入的选择进行进行赋值
        if("1".equals(result)){
            int dianzan = newsOld.getDianzan();
            dianzan++;
            newsOld.setDianzan(dianzan);
        }else if("2".equals(result)){
            int pinlun = newsOld.getPinlun();
            pinlun++;
            newsOld.setPinlun(pinlun);
        }else if("3".equals(result)){
            int shoucang = newsOld.getShoucang();
            shoucang++;
            newsOld.setShoucang(shoucang);
        }
        //重新添加进集合
        news.add(newsOld);
    }


}
class News implements Comparable<News>{
    private String title;
    private int dianzan;
    private int pinlun;
    private int shoucang;

    public News() {
    }

    public News(String title) {
        this.title = title;
    }

    public News(String title, int dianzan, int pinlun, int shoucang) {
        this.title = title;
        this.dianzan = dianzan;
        this.pinlun = pinlun;
        this.shoucang = shoucang;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDianzan() {
        return dianzan;
    }

    public void setDianzan(int dianzan) {
        this.dianzan = dianzan;
    }

    public int getPinlun() {
        return pinlun;
    }

    public void setPinlun(int pinlun) {
        this.pinlun = pinlun;
    }

    public int getShoucang() {
        return shoucang;
    }

    public void setShoucang(int shoucang) {
        this.shoucang = shoucang;
    }
    public int sum(){
        return dianzan*3+pinlun*5+shoucang*8;
    }
    @Override
    public String toString() {
        return "News{title='"+title+"'=count="+sum()+"}";
    }

    @Override
    public int compareTo(News o) {
        int result = o.sum()-sum();
        result = result ==0 ? o.title.compareTo(title) : result;
        return result;
    }
}
