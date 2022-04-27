package com.chenhao.homework;

public class Student {
    private String id;
    private String name;
    private String gender;

    public Student(String id, String name, String gender) {
        System.out.println("有参构造创建对象");
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Student() {
        System.out.println("无参构造创建对象");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    public void show(){
        System.out.println("show方法开始执行");
        System.out.println(toString());
    }
}
