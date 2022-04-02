package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.ShapeUtils;
import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.VWGolf4;

import java.util.Random;

public class CarsApplication {
    Random random = new Random();
    int drawNumber = random.nextInt(100);

    public static void main(String[] args) {

            Random random = new Random();
            Car[] cars = new Car[random.nextInt(20) + 1];
            for (int n = 0; n < cars.length; n++)
                cars[n] = drawCar();
            for (Car car : cars)
                CarUtils.describeCar(car);
        }


    public static Car drawCar(){
        Random random = new Random();
        int carType = random.nextInt(3);
        int carSpeed = random.nextInt(100);

        if (carType == 0)
            return new Opel(carSpeed);
        else if (carType == 1)
            return new Ford(carSpeed);
        else
            return new VWGolf4(carSpeed);
    }
}
