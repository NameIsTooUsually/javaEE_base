package com.chenhao.test.test2.animal.mammal;

import com.chenhao.test.test2.animal.Animal;

public class Mammal extends Animal {
    private String bodytemperature;
    private String runningSpeed;

    public Mammal() {
    }

    public Mammal(String eatFood, String weight, String bodytemperature, String runningSpeed) {
        super(eatFood, weight);
        this.bodytemperature = bodytemperature;
        this.runningSpeed = runningSpeed;
    }

    public String getBodytemperature() {
        return bodytemperature;
    }

    public void setBodytemperature(String bodytemperature) {
        this.bodytemperature = bodytemperature;
    }

    public String getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(String runningSpeed) {
        this.runningSpeed = runningSpeed;
    }
}
