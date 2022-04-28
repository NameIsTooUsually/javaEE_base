package com.chenhao.day09;


import java.util.HashMap;

/*
一个年级有若干个班级，每个班级有若干个学生；要求：时
1. 学生具有学号、姓名和成绩，学号和学生信息是一一对应的；
2. 使用集合保存这个年级的所有学生的信息，然后遍历输出；
 */
public class Test3 {
    public static void main(String[] args) {

        //创建一个双列集合来存储学生信息
        HashMap<Integer,Student> stuMap = new HashMap<>();
        Student str1 = new Student(1,"张三",66.5);
        Student str2 = new Student(2,"二狗",100.0);
        Student str3 = new Student(3,"李四",88);
        stuMap.put(str1.getId(),str1);
        stuMap.put(str2.getId(),str1);
        stuMap.put(str3.getId(),str1);

        for (Integer integer : stuMap.keySet()) {
            System.out.println("学号为"+integer+"的学生信息为"+stuMap.get(integer).toString());
        }
    }

}
class Student {
    private int id;
    private String name;
    private double score;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
