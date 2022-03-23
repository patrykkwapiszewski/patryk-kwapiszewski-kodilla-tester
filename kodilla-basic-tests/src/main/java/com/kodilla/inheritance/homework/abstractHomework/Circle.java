package com.kodilla.inheritance.homework.abstractHomework;

public class Circle extends Shape {


    public Circle() {
        super(12.2);
    }

    private double area;
    private double circuitValue;

    @Override
    public double surfaceArea() {
        if (getValue() > 0) {
            area = getValue() * getValue() * 3.14;
            System.out.println("Surface Area is = " + area);
        } else {
            System.out.println("Value has to be more than zero");
        } return area;
    }

    @Override
    public double circuit() {
        if (getValue()>0){
            circuitValue = getValue()*2*3.14;
            System.out.println("Circuit value is: "+circuitValue);
        } else {
            System.out.println("Value has to more than zero");
        }
        return circuitValue;
    }
}
