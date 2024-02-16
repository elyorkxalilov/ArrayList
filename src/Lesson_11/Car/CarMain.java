package Lesson_11.Car;

public class CarMain {
    public static void main(String[] args) {

        Car malibu = new Malibu(65,40);
        System.out.println(malibu.maxLongestWay(12));
        System.out.println(malibu.getMaxOilFromRefill());

        Car captiva = new Captiva(60,30);
        System.out.println(captiva.maxLongestWay(10));
        System.out.println(captiva.getMaxOilFromRefill());

    }
}
