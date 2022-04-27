package com.chenhao.edu.info.manager.domain;

public class Student {
    private String id;
    private String name;
    private int age;
    private String birtuday;

    public Student() {
    }

    public Student(String id, String name, int age, String birtuday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birtuday = birtuday;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirtuday() {
        return birtuday;
    }

    public void setBirtuday(String birtuday) {
        this.birtuday = birtuday;
    }
}
