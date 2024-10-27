package com.samsung;

import com.samsung.PC;
import com.samsung.DELL;
import com.samsung.HUAWEI;
import com.samsung.ASUS;
import com.samsung.LENOVO;

public class Main {

    public static void main(String[] args) {

        PC yourLaptop = new ASUS();
        System.out.println(yourLaptop);

        HUAWEI laptop = new HUAWEI(16, "intel");
        System.out.println(laptop);

        LENOVO newLaptop = new LENOVO(32, "Green", "800$", "AMD");
        System.out.println(newLaptop);

    }
}
