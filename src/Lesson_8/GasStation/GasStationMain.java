package Lesson_8.GasStation;

public class GasStationMain {
    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0]=new Car(new Capacity(50),new Oil("benzin"));
        cars[1]=new Car(new Capacity(100),new Oil("benzin"));
        cars[2]=new Car(new Capacity(100),new Oil("benzin"));

        GasStation gasStation = new GasStation(200);
        System.out.println(gasStation.isEmpty());
        gasStation.toSell(new Car(new Capacity(10),new Oil("Stirn")));
        gasStation.addPetrol(130);
        System.out.println(gasStation.isSell(cars));
    }
}
