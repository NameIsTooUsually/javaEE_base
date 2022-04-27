package com.chenhao.homework;


import java.util.TreeSet;

public class HomeWork5 {
    public static void main(String[] args) {

        Student1 stu1 = new Student1("二狗子",92,59,78);
        Student1 stu2 = new Student1("三狗子",60,90,98);
        Student1 stu3 = new Student1("四狗子",79,83,88);
        Student1 stu4 = new Student1("五狗子",99,85,78);

        TreeSet<Student1> stuArr = new TreeSet<>();
        stuArr.add(stu1);
        stuArr.add(stu2);
        stuArr.add(stu3);
        stuArr.add(stu4);
        System.out.println(stuArr);

    }


}


class Student1 implements Comparable<Student1> {
    private String name;
    private int chineseScore;
    private int mathScore;
    private int englidhScore;

    public Student1() {
    }

    public Student1(String name, int chineseScore, int mathScore, int englidhScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englidhScore = englidhScore;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                ", englidhScore=" + englidhScore +
                '}'+"总分为："+getTotalScore()+"\n";
    }

    int getTotalScore() {
        return chineseScore + mathScore + englidhScore;
    }

    @Override
    public int compareTo(Student1 o) {
        //将总分进行比较
        int result = this.getTotalScore() - o.getTotalScore();
        //如果总分相同再比较语文成绩
        result = 0 == result ? this.getChineseScore() - o.getChineseScore() : result;
        //如果语文成绩相同再比较数学成绩
        result = 0 == result ? this.getMathScore() - o.getMathScore() : result;
        //如果数学成绩也相同，那剩下的英语成绩也相同了，此时就不需要用分数进行比较了
        //此时用姓名进行比较
        result = 0 == result ? this.getName().compareTo(o.getName()) : result;

        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglidhScore() {
        return englidhScore;
    }

    public void setEnglidhScore(int englidhScore) {
        this.englidhScore = englidhScore;
    }
}