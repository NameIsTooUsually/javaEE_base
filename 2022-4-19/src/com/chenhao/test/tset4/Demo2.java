package com.chenhao.test.tset4;

public class Demo2 {
    public static void main(String[] args) {
        String[] strArr1 = {"张瑞淑", "徐海涛", "谢岗岗", "薛鹏", "魏明杨", "党婷", "熊飞", "郑翠翠",
                "李航卫", "屈涛", "汪孝双", "代攀飞", "武志钰", "王亚龙", "周芙榕", "李涛", "郝颖",
                "文冲洋", "王旭拯", "胡佳豪", "寇晓丽", "马晓晗", "王思聪", "张绿", "李德", "郑萍",
                "张凯", "张嘉成", "葛云侠", "杨磊", "任变", "景德", "高卷林", "刘益凡", "赵娜", "陈章鸣",
                "张荣召", "赵凯旋", "程倩倩", "脱朝平", "刘吉利", "郭苗苗", "马建峰", "潘瑞", "闫翔", "马晨",
                "李轩轩", "黄红梅", "刘书彬", "罗强", "刘东", "王可可", "陈泽文", "李嘉琪", "段佳琦",
                "黄燕", "邱淑鸿", "宋翔宇", "王波", "樊琳", "王兆国", "许成", "李兴"};
        String[] strArr2 = {"张瑞淑", "徐海涛", "谢岗岗", "薛鹏", "魏明杨", "党婷", "熊飞",
                "郑翠翠", "李航卫", "屈涛", "汪孝双", "代攀飞", "武志钰", "王亚龙", "周芙榕",
                "李涛", "郝颖", "文冲洋", "王旭拯", "胡佳豪", "寇晓丽", "马晓晗", "张绿", "李德",
                "郑萍", "张凯", "张嘉成", "葛云侠", "杨磊", "任变", "景德", "高卷林", "刘益凡", "赵娜",
                "陈章鸣", "张荣召", "赵凯旋", "程倩倩", "脱朝平", "刘吉利", "郭苗苗", "马建峰", "潘瑞",
                "闫翔", "马晨", "李轩轩", "黄红梅", "刘书彬", "罗强", "刘东", "陈泽文", "李嘉琪", "段佳琦",
                "黄燕", "邱淑鸿", "宋翔宇", "王波", "樊琳", "王兆国", "许成", "李兴"};
        String[] strArr3 = new String[200];
        int count = 0;
        for (int i = 0; i < strArr1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < strArr2.length; j++) {
                if (strArr1[i].equals(strArr2[j])) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                strArr3[count] = strArr1[i];
                count++;
            }
        }
        for (int i = 0; i < strArr3.length; i++) {
            if (strArr3[i] != null) {
                System.out.println(strArr3[i]);
            }
        }


    }
}
