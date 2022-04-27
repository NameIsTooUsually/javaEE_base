package com.chenhao.test.test2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.Scanner;

public class Log4JDemo2 {
    private static final Logger logger = LoggerFactory.getLogger("Log4JDemo2");
    public static void main(String[] args) {
        //

        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            int result = Integer.parseInt(str);
            logger.info("解析成功");
        }catch (Exception e){
            logger.info("输入的数据有误");
        }
    }
}
