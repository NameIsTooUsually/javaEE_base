package com.chenhao.homework;

import java.util.Comparator;
import java.util.TreeSet;

/*
​       请按以下要求顺序编码：
l  定义学生类Student，属性：姓名、性别、年龄
l  定义测试类，及main()方法
Ø  定义一个存储Student类型的TreeSet集合
Ø  创建以下三个Student对象
张三,男,20
李四,女,21
张三,男,20
Ø  将上述三个对象存储到Set集合中
Ø  使用增强for遍历集合，获取每个Student对象，并打印属性值；
Ø  请实现集合中按照姓名、年龄排序
 */
public class HomeWork3 {
    public static void main(String[] args) {
        //创建三个学生类对象
        Student stu1 = new Student("张三", "男", 20);
        Student stu2 = new Student("李四", "女", 21);
        Student stu3 = new Student("张三", "男", 20);
        //创建一个学生类的TreeSet集合对象
        //  实现集合中按照姓名、年龄排序()
        TreeSet<Student> stuSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //int result = o1.getName().compareTo(o2.getName());
                //result = 0 == result ? o1.getAge() - o2.getAge() : result;
                int result = o1.getAge() - o2.getAge();
                result = 0 == result ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        stuSet.add(stu1);
        stuSet.add(stu2);
        stuSet.add(stu3);
        for (Student student : stuSet) {
                System.out.println(student);
        }

    }
}

class Student {
    private String name;
    private String gender;
    private int age;

    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stuedent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student stuedent = (Student) o;

        if (age != stuedent.age) return false;
        if (name != null ? !name.equals(stuedent.name) : stuedent.name != null) return false;
        return gender != null ? gender.equals(stuedent.gender) : stuedent.gender == null;
    }


}