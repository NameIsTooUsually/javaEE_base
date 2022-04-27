package com.chenhao.test.test3;

public abstract class Member {
    private String id;
    private String name;
    private int age;

    //无参构造 和 全参构造
    public Member() {
    }

    public Member(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //get...set方法略
    public final void notice() {
        System.out.println("通知：");
        body();
        System.out.println("\t\t必胜环球科技有限公司");
    }

    public abstract void body();
}

class Personnel extends Member {
    //无参构造 和 全参构造
    public Personnel() {
    }

    public Personnel(String id, String name, int age) {
        super(id, name, age);
    }

    //get...set方法略
    @Override
    public void body() {
        System.out.println("\t员工通知的内容");
    }
}

class Manager extends Member {
    private String bonus;

    //无参构造 和 全参构造
    public Manager() {
    }

    public Manager(String id, String name, int age, String bonus) {
        super(id, name, age);
        this.bonus = bonus;
    }

    //get...set方法略
    @Override
    public void body() {
        System.out.println("\t经理通知的内容");
    }

}

class Test4 {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.notice();

        Personnel personnel = new Personnel();
        personnel.notice();
    }

}