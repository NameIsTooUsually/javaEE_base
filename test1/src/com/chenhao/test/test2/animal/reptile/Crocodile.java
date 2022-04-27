package com.chenhao.test.test2.animal.reptile;

public class Crocodile extends Reptile{
    private String mouth;

    public Crocodile() {
    }

    public Crocodile(String eatFood, String weight, String sleep, String canSwim, String mouth) {
        super(eatFood, weight, sleep, canSwim);
        this.mouth = mouth;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }
}
