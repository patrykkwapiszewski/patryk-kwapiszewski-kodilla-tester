package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int productionYear;
    public OperatingSystem(int productionYear){
        this.productionYear = productionYear;
        System.out.println("Operating system information");
    }
    public void turnOn() {
        System.out.println("Running operating system...");
    }

    public void turnOff() {
        System.out.println("Turning off operating system...");
    }

    public void displayName() {
        System.out.println("This is default operating system");
    }
    public int getYear() {
        return productionYear;
    }
    public void displayYear() {
        System.out.println("This OS was made in:" + productionYear);
    }
}
