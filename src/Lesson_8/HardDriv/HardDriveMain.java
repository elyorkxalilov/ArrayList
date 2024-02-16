package Lesson_8.HardDriv;

public class HardDriveMain {
    public static void main(String[] args) {

        HardDrive hardDrive = new HardDrive("tel", 0, 1000);

        File file = new File("books", 50);

        hardDrive.write(file);
        hardDrive.remove(30);
        hardDrive.clear();
        System.out.println("isEmpty = " + hardDrive.isEmpty());
        System.out.println("isFull = " + hardDrive.isFull());
        System.out.println("band joy yani getaUsebSapce = " + hardDrive.getUsebSapce());
        System.out.println("bo`sh joy yani getaFreeSapce = " + hardDrive.getFreeSapce());
    }
}
