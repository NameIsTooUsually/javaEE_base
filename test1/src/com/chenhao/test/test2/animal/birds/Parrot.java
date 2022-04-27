package com.chenhao.test.test2.animal.birds;

public class Parrot extends Birds{
    private String headFeathers;

    public Parrot() {
    }

    public Parrot(String eatFood, String weight, String color, String beak, String headFeathers) {
        super(eatFood, weight, color, beak);
        this.headFeathers = headFeathers;
    }

    public String getHeadFeathers() {
        return headFeathers;
    }

    public void setHeadFeathers(String headFeathers) {
        this.headFeathers = headFeathers;
    }
}
