package Lesson_9.Car;

public class Car {
    private final String carName;
    private final String carNumber;

    public Car(String carName, String carNumber) {
        this.carName = carName;
        this.carNumber = carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarNumber() {
        return carNumber;
    }
}
