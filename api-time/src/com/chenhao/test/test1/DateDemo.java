package com.chenhao.test.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDemo {
    /*
    秒杀的起始时间-
    开始时间是2020年11月11日 00:00:00，
    - 结束时间是2020年11月11日 00:10:00；
    用户下单时间
    - 用户小贾下单时间是2020年11月11日 00:03:47，
    - 用户小皮下单时间是2020年11月11日 00:10:11；
    判断两个用户有没有成功参与秒杀活动
     */
    public static void main(String[] args) throws ParseException {
    //开始时间"
        String startTime = "2020年11月11日 00:00:00";
    //结束时间
        String endTime = "2020年11月11日 00:10:00";
    //小贾下单时间
        String jiaTime = "2020年11月11日 00:03:47";
        //小皮下单时间
        String piTime = "2020年11月11日 00:10:11";
        //创建简单时间格式
        SimpleDateFormat sdp = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long stime = sdp.parse(startTime).getTime();
        long etime = sdp.parse(endTime).getTime();
        long jtime = sdp.parse(jiaTime).getTime();
        long ptime = sdp.parse(piTime).getTime();

        if(jtime>=stime &&jtime<=etime){
            System.out.println("参加上了秒杀活动");
        }else{
            System.out.println("没有参加上秒杀活动");
        }
        if(ptime>=stime &&ptime<=etime){
            System.out.println("参加上了秒杀活动");
        }else{
            System.out.println("没有参加上秒杀活动");
        }
    }
}
