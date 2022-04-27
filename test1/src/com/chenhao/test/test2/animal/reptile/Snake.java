package com.chenhao.test.test2.animal.reptile;

public class Snake extends Reptile{
    private String hasVenom;
    private String length;

    public Snake() {
    }

    public Snake(String eatFood, String weight, String sleep, String canSwim, String hasVenom, String length) {
        super(eatFood, weight, sleep, canSwim);
        this.hasVenom = hasVenom;
        this.length = length;
    }

    public String getHasVenom() {
        return hasVenom;
    }

    public void setHasVenom(String hasVenom) {
        this.hasVenom = hasVenom;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
