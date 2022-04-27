package com.chenhao.test.test6;

public class Student {
    private String id;
    private String name;
    public int age;
    public void study(){
        System.out.println("好好学习，天天向上");
    }
    public String swin(int a ){
        System.out.println("铁子，咱们去游泳吧,有"+a+"美女");
        return "好的";
    }
    private String money(){
        return "学生都是没有钱的";
    }
    private String money(int a){
        return "家里给了钱了"+a;
    }


    public Student() {
        System.out.println("公共空参构造");
    }

    public Student(String id, String name, int age) {
        System.out.println("公共三个参数构造");
        this.id = id;
        this.name = name;
        this.age = age;
    }
    private Student(String messge){
        System.out.println("私有一个参数构造");
        System.out.println(messge);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
