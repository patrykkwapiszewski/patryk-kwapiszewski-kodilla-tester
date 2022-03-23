package com.kodilla.inheritance.homework.abstractHomework;

public abstract class Shape {

    private double value;

    public Shape(double value) {
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public abstract double surfaceArea();

    public abstract double circuit();

}
