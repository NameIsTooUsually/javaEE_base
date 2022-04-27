package com.chenhao.day07;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        IDataOperationImpl ip = new IDataOperationImpl();
        ip.add(new Student("111","111",35,"1111"));
        ip.add(new Student("222","111",35,"1111"));
        ip.add(new Student("333","111",35,"1111"));
        ip.add(new Student("444","111",35,"1111"));
        ip.add(new Student("555","111",35,"1111"));


        //System.out.println(ip.get("222"));
        //System.out.println(ip.get("3323"));
        //System.out.println(ip.delete("3435"));
        //System.out.println("555");
        System.out.println(ip.update(new Student("555", "121", 1105, "1111")));
        System.out.println(ip.getAll());
    }
}
//创建IDataOperation的实现类
class IDataOperationImpl implements IDataOperation<Student>{
    private TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getId().compareTo(o2.getId());
        }
    });

    @Override
    public boolean add(Student t) {
        return treeSet.add(t);
    }

    @Override
    public <T> boolean delete(T t) {
        return treeSet.removeIf((s)->{
            return t.equals(s.getId());
        });
    }

    @Override
    public <T> boolean update(Student student) {
        Student student1 = get(student.getId());
        if(student1==null){
            System.out.println("没有这个学生信息");
            return false;
        }else{
            treeSet.remove(student1);
            treeSet.add(student);
            return true;
        }
    }

    @Override
    public <T> Student get(T t) {
        if(treeSet.isEmpty()){
            System.out.println("还没有学生信息！");
        }else{
            for (Student student : treeSet) {
                if(t.equals(student.getId())){
                    return student;
                }
            }
        }
        return null;
    }

    @Override
    public Collection<Student> getAll() {
       return treeSet;
    }
}

//数据操作接口
interface IDataOperation<E> {
    // 添加数据
    public boolean add(E t);
    // 根据唯一标识删除一个数据
    public <T> boolean delete(T t);
    // 修改一个数据
    public <T> boolean update(E e);
    // 根据唯一表示查找一个数据
    public <T> E get(T t);
    // 查找所有数据
    public Collection<E> getAll();
}

//创建一个学生类
class Student{
    private String id;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

