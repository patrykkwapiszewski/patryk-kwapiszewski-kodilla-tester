package com.kodilla.inheritance.homework;

public class windows extends OperatingSystem{
    public windows(int productionYear) {
        super(productionYear);
        System.out.println("This OS is made by Microsoft");
    }

    public void openEdge() {
        System.out.println("Running MicrosoftEdge web browser ");
    }
    @Override
    public void displayName() {
        System.out.println("This is Windows");
    }
}
