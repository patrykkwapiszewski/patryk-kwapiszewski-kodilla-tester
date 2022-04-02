package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.VWGolf4;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Opel(2));
        cars.add(new VWGolf4(60));

        cars.remove(0);
        cars.remove(new VWGolf4(60));

        System.out.println(cars.size());

        for(Car car : cars)
           CarUtils.describeCar(car);
    }

}
