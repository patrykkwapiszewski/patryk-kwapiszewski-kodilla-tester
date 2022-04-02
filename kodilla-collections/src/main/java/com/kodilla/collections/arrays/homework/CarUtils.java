package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.VWGolf4;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("---------------------");
        System.out.println("Car speed is:" + car.getSpeed());
        System.out.println("Car brand is:" + car.getName());
    }

}
