package com.example.edittextrecyclerview;

public class Pojo {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public Pojo(String name, String price, String image){
        this.name=name;
        this.price=price;
        this.image=image;
    }

    String name;
    String price;
    String image;
}
