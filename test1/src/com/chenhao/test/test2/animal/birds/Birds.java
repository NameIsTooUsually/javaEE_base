package com.chenhao.test.test2.animal.birds;

import com.chenhao.test.test2.animal.Animal;

public class Birds extends Animal {
    private String color;
    private String beak;

    public Birds() {
    }

    public Birds(String eatFood, String weight, String color, String beak) {
        super(eatFood, weight);
        this.color = color;
        this.beak = beak;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBeak() {
        return beak;
    }

    public void setBeak(String beak) {
        this.beak = beak;
    }
}
