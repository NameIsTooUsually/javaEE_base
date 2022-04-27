package com.chenhao.test.test2.animal;

public class Animal {
    private String eatFood;
    private String weight;

    public Animal() {
    }

    public Animal(String eatFood, String weight) {
        this.eatFood = eatFood;
        this.weight = weight;
    }

    public String getEatFood() {
        return eatFood;
    }

    public void setEatFood(String eatFood) {
        this.eatFood = eatFood;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
