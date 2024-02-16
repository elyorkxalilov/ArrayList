package Lesson_7.Car;

import Lesson_7.Car.Car;

public class Malibu extends Car {
    public Malibu(int weight, int fuelCapacity, int brakingDistance){
        super(weight, fuelCapacity, brakingDistance);
    }
    @Override
    void showInfo(){
        System.out.println(" black");
    }
}
