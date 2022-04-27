package com.chenhao.test.test2.animal.birds;

public class Owl extends Birds{
    private String size;

    public Owl() {
    }

    public Owl(String eatFood, String weight, String color, String beak, String size) {
        super(eatFood, weight, color, beak);
        this.size = size;
    }
}
