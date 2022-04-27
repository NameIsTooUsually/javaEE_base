package com.chenhao.test.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd  hh时mm分ss秒");
        Date date = new Date();
        String str = "2022-03-28  11时22分08秒";
        SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-M-dd");

        System.out.println(sd.format(date));
        sd1.parse(str);
        /*try {
            System.out.println(sd1.parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
    }
}
