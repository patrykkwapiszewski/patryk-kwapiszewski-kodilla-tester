package com.kodilla.inheritance.homework.abstractHomework;

public class square extends Shape{
    public square() {
        super(3.1);
    }

    private double area;

    @Override
    public double surfaceArea() {
        if (getValue() > 0) {
            area = getValue() * getValue();
            System.out.println("Surface Area is = " + area);
        } else {
            System.out.println("Value has to be more than zero");
        } return area;
    }

    private double circuitValue;

    @Override
    public double circuit() {
        if (getValue()>0){
            circuitValue = getValue()*4;
            System.out.println("Circuit value is: "+circuitValue);
        } else {
            System.out.println("Value has to more than zero");
        }
        return circuitValue;
    }
}
