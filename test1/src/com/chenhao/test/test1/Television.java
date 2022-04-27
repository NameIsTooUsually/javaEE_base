package com.chenhao.test.test1;

public class Television extends Appliance{
    private String screenSize;
    private String resolution;

    public Television() {
    }

    public Television(String brand, String model, String color, String price, String screenSize, String resolution) {
        super(brand, model, color, price);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
