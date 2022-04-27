package com.chenhao.test.test1;

public class Refrigerator extends Appliance{
    private String doorStyle;
    private String coolingMode;

    public Refrigerator() {
    }

    public Refrigerator(String brand, String model, String color, String price, String doorStyle, String coolingMode) {
        super(brand, model, color, price);
        this.doorStyle = doorStyle;
        this.coolingMode = coolingMode;
    }

    public String getDoorStyle() {
        return doorStyle;
    }

    public void setDoorStyle(String doorStyle) {
        this.doorStyle = doorStyle;
    }

    public String getCoolingMode() {
        return coolingMode;
    }

    public void setCoolingMode(String coolingMode) {
        this.coolingMode = coolingMode;
    }
}
