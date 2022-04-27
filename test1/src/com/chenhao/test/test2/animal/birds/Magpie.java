package com.chenhao.test.test2.animal.birds;

public class Magpie extends Birds {
    private String area;

    public Magpie() {
    }

    public Magpie(String eatFood, String weight, String color, String beak, String area) {
        super(eatFood, weight, color, beak);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
