package com.seventyseven.projecttb.model.bean;

import org.litepal.crud.LitePalSupport;

public class Product extends LitePalSupport {
    private int id;
    private String introduce;
    private String name;
    private String picture;
    private Double price;
    private int count;

    public Product(){ }

    public Product(String name,String introduce,String picture,Double price){
        this.name = name;
        this.introduce = introduce;
        this.picture = picture;
        this.price = price;
        this.count = 0;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getIntroduce() {
        return introduce;
    }

    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}


