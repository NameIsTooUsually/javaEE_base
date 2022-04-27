package com.chenhao.test.test1;

/*
- 冰箱类
  - 属性：品牌、型号、颜色、售价、门款式、制冷方式
- 洗衣机类
  - 属性：品牌、型号、颜色、售价、电机类型、洗涤容量
- 电视类
  - 属性：品牌、型号、颜色、售价、屏幕尺寸、分辨率
 */
public class Appliance {
    private String brand;
    private String model;
    private String color;
    private String price;

    public Appliance() {
    }

    public Appliance(String brand, String model, String color, String price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
