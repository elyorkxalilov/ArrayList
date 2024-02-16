package Lesson_7.Car;

public class Captiva extends Car {
    public Captiva(int weight, int fuelCapacity, int brakingDistance) {
        super(weight, fuelCapacity, brakingDistance);
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println(" tall");
    }
}
