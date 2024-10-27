package com.samsung;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HUAWEI {
    private int RAM;
    private String color;
    private String cost;
    private String processor;


    public HUAWEI(int RAM, String color, String cost, String processor) {
        this.RAM = RAM;
        this.color = color;
        this.cost = cost;
        this.processor = processor;
    }

    public HUAWEI(int RAM, String processor) {
        this.RAM = RAM;
        this.processor = processor;
    }

    public int getRAM() {
        return RAM;
    }

    public String getColor() {
        return color;
    }

    public String getCost() {
        return cost;
    }

    public String getProcessor() {
        return processor;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "RAM: " + getRAM() +
                " Processor: " + getProcessor() +
                " Cost: " + getCost() +
                " Color: " + getColor();
    }


}
