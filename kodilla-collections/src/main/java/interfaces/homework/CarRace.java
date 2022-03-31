package interfaces.homework;

import interfaces.Shape;

public class CarRace {

    public static void main(String[] args) {
        Opel opel = new Opel(0);
        doRace(opel);

        Ford ford = new Ford(0);
        doRace(ford);

        VWGolf4 vwGolf4 = new VWGolf4(0);
        doRace(vwGolf4);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
