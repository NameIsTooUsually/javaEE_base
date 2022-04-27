package com.chenhao.test.test2.animal.mammal;

public class Giraffe extends Mammal{
    private String neckLength;

    public Giraffe() {
    }

    public Giraffe(String eatFood, String weight, String bodytemperature, String runningSpeed, String neckLength) {
        super(eatFood, weight, bodytemperature, runningSpeed);
        this.neckLength = neckLength;
    }

    public String getNeckLength() {
        return neckLength;
    }

    public void setNeckLength(String neckLength) {
        this.neckLength = neckLength;
    }
}
