package Lesson_9.App;

public class AppMain {
    public static void main(String[] args) {

       Device device = new Device(new App("Telegram", 40),512);
        System.out.println(device.install(new App("Instagram", 42)));
        device.showApps();
        System.out.println(device.uninstall("Clic"));
        device.run(new App("Telegram", 40));
        System.out.println(device.info());
    }
}
