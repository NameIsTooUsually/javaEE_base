package com.chen.mypolymorphic;

public class Test1 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        System.out.println(animal instanceof Cat);
    }
}

