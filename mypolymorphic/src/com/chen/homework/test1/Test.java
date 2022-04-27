package com.chen.homework.test1;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        ((Cat)animal).behavior();
    }
}
