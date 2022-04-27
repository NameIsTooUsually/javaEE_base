package com.chenhao.day14;

import java.util.Arrays;

/*
1. 对Java基础班学生的考试成绩进行排序
   定义一个学生类，有两个属性。姓名，考试成绩
2. 在测试类中定义一个学生数组，存储学生信息。
3. 使用Lambda省略格式写法对学生数组按照考试成绩由高到低进行排序。
 */
public class Test3 {
    public static void main(String[] args) {
        //创建一个学生类型数组
        Student[] arr = new Student[3];
        //添加元素
        arr[0] = new Student("小明", 88);
        arr[1] = new Student("小刚", 69);
        arr[2] = new Student("小红", 99);
        //调用方法进行排序
        Arrays.sort(arr, (s1, s2) ->
                s2.getScore() - s1.getScore());
        for (Student student : arr) {
            System.out.println(student.getName()+"-----"+student.getScore());
        }
    }
}

class Student {
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}