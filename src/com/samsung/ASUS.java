package com.samsung;

public class ASUS implements PC{
    private String model;

    @Override
    public void color() {
        System.out.println("color: blue");
    }

    @Override
    public void cost() {
        System.out.println("cost: 700$");
    }

    @Override
    public void RAM() {
        System.out.println("RAM: 16gb");
    }

    @Override
    public String toString() {
        return "ASUS{" +
                "model='" + model +
                '}';
    }
}
