package com.chenhao.test.tset5;

public class Student {
    private String id;
    private String name;
    private String age;
    public  int many = 100;

    public Student() {
        System.out.println("公共的没有参数的构造方法");
    }

    private Student(String name) {
        System.out.println("私有的没有参数的构造方法");
        this.name = name;
    }

    public Student(String id, String name, String age) {
        System.out.println("公共的三个参数的构造方法");
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void swin() {
        System.out.println("铁子，咱们去游泳吧！！！");
    }

    private void study() {
        System.out.println("好好学习，天天向上");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
