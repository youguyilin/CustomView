package com.example.yingen.customview.Model;

/**
 * Created by chuyingen on 2018/3/22.
 * email youguyilin@126.com.
 */

public class Rings {
    // 名称
    private String itemType;
    private double value;
    private String colors;
    private int sw;

    public Rings(String itemType, double itemValue, String color) {
        this.itemType = itemType;
        this.value = itemValue;
        this.colors = color;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getItemValue() {
        return value;
    }

    public void setItemValue(double itemValue) {
        this.value = itemValue;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String color) {
        this.colors = color;
    }

    public int getSw() {
        return sw;
    }

    public void setSw(int sw) {
        this.sw = sw;
    }

}
