package com.chenhao.test;

import java.util.HashSet;

public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet<Student2> hashSet = new HashSet<>();
        Student2 stu1 = new Student2("二狗子",29);
        Student2 stu2 = new Student2("三狗子",24);
        Student2 stu3 = new Student2("四狗子",27);
        Student2 stu4 = new Student2("二狗子",29);
        hashSet.add(stu1);
        hashSet.add(stu2);
        hashSet.add(stu3);
        hashSet.add(stu4);

        System.out.println(hashSet);
    }
}
