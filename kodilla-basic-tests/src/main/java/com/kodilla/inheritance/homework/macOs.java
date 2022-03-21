package com.kodilla.inheritance.homework;

public class macOs extends OperatingSystem{
    public macOs(int productionYear) {
        super(productionYear);
        System.out.println("This is operating system made by Apple");
    }

    public void openSafari() {
        System.out.println("Opening Safari web browser...");
    }
    @Override
    public void displayName() {
        System.out.println("This is macOs");
    }
}
