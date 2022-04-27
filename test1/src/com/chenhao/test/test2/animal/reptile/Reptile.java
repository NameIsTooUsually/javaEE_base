package com.chenhao.test.test2.animal.reptile;

import com.chenhao.test.test2.animal.Animal;

public class Reptile extends Animal {
    private String sleep;
    private String canSwim;

    public Reptile() {
    }

    public Reptile(String eatFood, String weight, String sleep, String canSwim) {
        super(eatFood, weight);
        this.sleep = sleep;
        this.canSwim = canSwim;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getCanSwim() {
        return canSwim;
    }

    public void setCanSwim(String canSwim) {
        this.canSwim = canSwim;
    }
}
