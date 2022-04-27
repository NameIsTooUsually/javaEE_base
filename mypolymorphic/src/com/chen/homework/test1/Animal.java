package com.chen.homework.test1;
/*
   - 属性：名称、年龄、性别
- 行为：吃饭(非抽象)
    */
public class Animal {
   private String name;
   private String age;
   private String sexOfAnimal;

   public void eat(){
       System.out.println("动物都需要吃饭");
   }

    public Animal() {
    }

    public Animal(String name, String age, String sexOfAnimal) {
        this.name = name;
        this.age = age;
        this.sexOfAnimal = sexOfAnimal;
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

    public String getSexOfAnimal() {
        return sexOfAnimal;
    }

    public void setSexOfAnimal(String sexOfAnimal) {
        this.sexOfAnimal = sexOfAnimal;
    }
}
