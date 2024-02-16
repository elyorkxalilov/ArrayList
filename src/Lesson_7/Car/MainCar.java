package Lesson_7.Car;

public class MainCar {
    public static void main(String[] args) {

        Car car = new Car(4500, 100,10);
        Malibu malibu = new Malibu(1800, 70,15);
        Captiva captiva = new Captiva(2000, 65,18);
        car.showInfo();
        malibu.showInfo();
        captiva.showInfo();
    }
}
