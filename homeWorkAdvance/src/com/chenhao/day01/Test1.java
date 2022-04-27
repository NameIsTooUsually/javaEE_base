package com.chenhao.day01;

public class Test1 {
    public static void main(String[] args) {
        //创建一个员工类对象
        Clerk c= new Clerk("李小亮","c001","销售部");
        //创建一个员工类对象
        Manager m = new Manager("张小强","m001","销售部");
        //给员工添加经理
        c.setMg(m);
        //给经理添加员工
        m.setCl(c);
        c.show();
        m.show();
    }
}
//定义一个职员类
class Clerk extends Employee{
    private Manager mg;

    public Clerk() {
    }

    public Clerk(String name, String id, String dept) {
        super(name, id, dept);
    }

    public Manager getMg() {
        return mg;
    }

    public void setMg(Manager mg) {
        this.mg = mg;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("他的经理是"+mg.getName());
    }
}
//定义一个经理类
class Manager extends Employee{
    private Clerk cl;

    public Manager(Clerk cl) {
        this.cl = cl;
    }

    public Clerk getCl() {
        return cl;
    }

    public void setCl(Clerk cl) {
        this.cl = cl;
    }

    public Manager(String name, String id, String dept) {
        super(name, id, dept);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("他的职员是"+cl.getName());
    }
}

//定义一员工类
class Employee{
    private String name;
    private String id;
    private String dept;

    public Employee() {
    }
    public void show(){
        System.out.println(dept+"的："+name+"，员工编号："+id);
    }

    public Employee(String name, String id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
