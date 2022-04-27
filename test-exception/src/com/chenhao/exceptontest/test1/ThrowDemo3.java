package com.chenhao.exceptontest.test1;

import java.text.SimpleDateFormat;
import java.time.*;

public class ThrowDemo3 {
    public static void main(String[] args) {


            //int [] arr = {1,2,3};
            int[] arr = null;
            try {
                System.out.println("异常前");
                //有肯能发现异常的代码
                //printArr(arr);
                //SimpleDateFormat sdf = new SimpleDateFormat();
                //sdf.parse("xxxx");
                printArr(arr);
                int i = 1/0;
                System.out.println("异常后");
            }catch (NullPointerException e){
                //如果出现了这样的异常,那么我们进行的操作
                String message = e.getMessage();
                System.out.println(message);
                System.out.println("catch中：参数不能为null");
            }/*catch (ParseException e){
            System.out.println("catch2中：格式不对");
        }*/catch (Exception e) {
                System.out.println("catch中：有异常，我给处理了");
            }


            System.out.println("catch外后：嘿嘿嘿,我最帅!!!");
            Throwable throwable = new Throwable();
        }

        private static void printArr(int[] arr) {
            if (arr == null) {
                throw new NullPointerException("空指针异常了！！！！！！！");
            } else {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
            }
        }
    }



