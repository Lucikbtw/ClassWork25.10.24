package com.samsung;

public class DELL implements PC {
    private String model;

    @Override
    public void color() {
        System.out.println("Color: silver");
    }

    @Override
    public void cost() {
        System.out.println("Cost: 400$");
    }

    @Override
    public void RAM() {
        System.out.println("RAM: 8GB");
    }
}
