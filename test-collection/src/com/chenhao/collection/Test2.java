package com.chenhao.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        Collection<Student> stuList = new ArrayList<>();
        Student stu1 = new Student("A1401080372","张三","28");
        Student stu2 = new Student("A1401080373","周生生","28");
        Student stu3 = new Student("A1401080374","陆天泽","28");
        Student stu4 = new Student("A1401080374","陆天泽","28");

        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        stuList.add(stu4);

        Iterator<Student> stuListIt = stuList.iterator();
        while(stuListIt.hasNext()){
            System.out.println(stuListIt.next());
        }

        System.out.println(((ArrayList<Student>) stuList).get(2).equals(((ArrayList<Student>) stuList).get(3)));
    }
}
class Student{
    private String id;
    private String name;
    private String age;

    public Student(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return age != null ? age.equals(student.age) : student.age == null;
    }


}
