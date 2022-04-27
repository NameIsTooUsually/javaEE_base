package com.chenhao.test.test1;

public class WashingMachine extends Appliance {
    private String motorType;
    private String washingCapacity;

    public WashingMachine() {

    }

    public WashingMachine(String brand, String model, String color, String price, String motorType, String washingCapacity) {
        super(brand, model, color, price);
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getWashingCapacity() {
        return washingCapacity;
    }

    public void setWashingCapacity(String washingCapacity) {
        this.washingCapacity = washingCapacity;
    }
}
