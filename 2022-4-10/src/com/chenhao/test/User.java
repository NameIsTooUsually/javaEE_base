package com.chenhao.test;

import java.io.Serializable;

public class User implements Serializable {
    public static final long serializableUID = 10086L;
    private String nage;
    private Integer age;

    public User() {
    }

    public User(String nage, Integer age) {
        this.nage = nage;
        this.age = age;
    }

    public String getNage() {
        return nage;
    }

    public void setNage(String nage) {
        this.nage = nage;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "nage='" + nage + '\'' +
                ", age=" + age +
                '}';
    }
}
