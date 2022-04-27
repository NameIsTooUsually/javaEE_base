package com.chenhao.test.test2.animal.mammal;

public class Elephanr extends Mammal{
    private String height;
    private String tooth;

    public Elephanr() {
    }

    public Elephanr(String eatFood, String weight, String bodytemperature, String runningSpeed, String height, String tooth) {
        super(eatFood, weight, bodytemperature, runningSpeed);
        this.height = height;
        this.tooth = tooth;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getTooth() {
        return tooth;
    }

    public void setTooth(String tooth) {
        this.tooth = tooth;
    }
}
