package com.chenhao.test.test2;

import com.chenhao.test.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeTest {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",25);
        Student stu2 = new Student("张四",25);
        Student stu3 = new Student("张五",25);
        Student stu4 = new Student("张六",25);

        /*TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                result = 0==result ? o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });*/
        TreeSet<Student> students = new TreeSet<>((Student o1, Student o2)->{int result = o1.getAge() - o2.getAge();
            result = 0==result ? o1.getName().compareTo(o2.getName()):result;
            return result;});
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);

        System.out.println(students);
    }

}
