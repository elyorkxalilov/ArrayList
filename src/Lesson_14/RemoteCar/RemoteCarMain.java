package Lesson_14.RemoteCar;

public class RemoteCarMain {
    public static void main(String[] args) {

        Battery battery = new Battery(4, 5000, 60);
       // battery.run(2);

        System.out.println("Bateraka qoshish mumkinmi? -> " + battery.addBattery());
       // System.out.println("n = " + battery.n);
       // System.out.println("count = " + battery.count);
       // System.out.println("n = " + battery.n);
       // System.out.println("bo`sh joy " + battery.getnumberOfBatterySlots());
        System.out.println("Batareka zaryadi " + battery.getBatteryInfo() + " %");
        System.out.println("Bateraka qoshish mumkinmi? -> " + battery.addBattery());
       // System.out.println("n = " + battery.n);
       // System.out.println("count = " + battery.count);
       // System.out.println("n = " + battery.n);
       // System.out.println("bo`sh joy " + battery.getnumberOfBatterySlots());
        System.out.println("Batareka zaryadi " + battery.getBatteryInfo() + " %");
        System.out.println("Bateraka qoshish mumkinmi? -> " + battery.addBattery());
        System.out.println("Bateraka qoshish mumkinmi? -> " + battery.addBattery());

        System.out.println(battery.isFull());

    }
}
