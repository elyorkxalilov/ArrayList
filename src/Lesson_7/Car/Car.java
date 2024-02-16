package Lesson_7.Car;

public class Car {
    int weight; // vazn
    int fuelCapacity; // yoqilgi quvvati
    int brakingDistance; // tormoz masofasi

    public Car(int weight, int fuelCapacity, int brakingDistance){
        this.weight = weight;
        this.fuelCapacity = fuelCapacity;
        this.brakingDistance =brakingDistance;
    }
    void showInfo(){
        System.out.print(weight + " ");
        System.out.print(fuelCapacity + " ");
        System.out.println(brakingDistance + " ");
    }

}
