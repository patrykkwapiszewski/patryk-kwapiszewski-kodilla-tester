package com.kodilla.inheritance.homework.abstractHomework.jobPackage;

public class Bartender extends Job{
    public Bartender() {
        super(3500, "Preparing cocktails");
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Bartender responsibilities are: " + getJobResponsibilities());
    }
}
