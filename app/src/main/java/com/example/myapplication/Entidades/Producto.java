package com.example.myapplication.Entidades;

public class Producto {
    private String name;

    public Producto(String name, String toString, int image, int icon3) {
    }

    public String getName() {
        return name;
    }

    public Producto(String name, int price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    private int price;
    private int image;
}
