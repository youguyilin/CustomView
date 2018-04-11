package com.example.yingen.customview.Model;

/**
 * Created by chuyingen on 2018/4/11.
 * email youguyilin@126.com.
 */

public class Performer {
    private String name;
    private int itemType;

    public Performer(String mName, int mItemType) {
        name = mName;
        itemType = mItemType;
    }

    public Performer(String mName) {
       this(mName,11);
    }

    public String getName() {
        return name;
    }

    public void setName(String mName) {
        name = mName;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int mItemType) {
        itemType = mItemType;
    }
}
