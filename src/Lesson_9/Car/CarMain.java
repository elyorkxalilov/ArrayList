package Lesson_9.Car;

public class CarMain {
    public static void main(String[] args) {

        Car[] arrCars = new Car[3];
        arrCars[0] = new Car("Jentra","70 A 555 BD");
        arrCars[1] = new Car("Lacetti","70 A 666 BD");
        arrCars[2] = new Car("Spark","70 A 777 BD");

        Parking parking = new Parking(5);
        System.out.println(parking.isEmpty());
        System.out.println(parking.isFull());
        parking.show();
        parking.addCar(new Car("Cobalt","70 A 111 BD"));
        parking.addCar(new Car("Malibu","70 A 222 BD"));
        parking.addCar(new Car("Nexia2","70 A 333 BD"));
        parking.addCar(new Car("Captiva","70 A 444 BD"));
        parking.addCars(arrCars);
        System.out.println(parking.isEmpty());
        System.out.println(parking.isFull());
    }
}
