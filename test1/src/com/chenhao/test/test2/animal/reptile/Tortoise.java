package com.chenhao.test.test2.animal.reptile;

public class Tortoise extends Reptile{
    private String brineOrFresh;

    public Tortoise() {
    }

    public Tortoise(String eatFood, String weight, String sleep, String canSwim, String brineOrFresh) {
        super(eatFood, weight, sleep, canSwim);
        this.brineOrFresh = brineOrFresh;
    }

    public String getBrineOrFresh() {
        return brineOrFresh;
    }

    public void setBrineOrFresh(String brineOrFresh) {
        this.brineOrFresh = brineOrFresh;
    }
}
