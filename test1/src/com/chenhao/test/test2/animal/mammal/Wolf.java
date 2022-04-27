package com.chenhao.test.test2.animal.mammal;

public class Wolf extends Mammal {
    private String howl;

    public Wolf() {
    }

    public Wolf(String eatFood, String weight, String bodytemperature, String runningSpeed, String howl) {
        super(eatFood, weight, bodytemperature, runningSpeed);
        this.howl = howl;
    }

    public String getHowl() {
        return howl;
    }

    public void setHowl(String howl) {
        this.howl = howl;
    }
}
