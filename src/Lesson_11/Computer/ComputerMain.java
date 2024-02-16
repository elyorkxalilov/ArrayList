package Lesson_11.Computer;

public class ComputerMain {
    public static void main(String[] args) {

        Computer acer = new Acer("AAA",256);
        acer.showInfo();

        Computer hp = new HP("BBB",512);
        hp.showInfo();

        Computer msi = new MSI("DDD",1000);
        msi.showInfo();
    }
}
