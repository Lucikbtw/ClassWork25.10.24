package com.samsung;

public class LENOVO extends HUAWEI {

    public LENOVO(int RAM, String color, String cost, String processor) {
        super(RAM, color, cost, processor);
    }

    @Override
    public int getRAM() {
        return super.getRAM();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getCost() {
        return super.getCost();
    }

    @Override
    public String getProcessor() {
        return super.getProcessor();
    }
}
