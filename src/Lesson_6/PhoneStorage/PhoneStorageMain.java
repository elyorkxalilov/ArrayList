package Lesson_6.PhoneStorage;

public class PhoneStorageMain {
    public static void main(String[] args) {

        PhoneStorage phoneStorage = new PhoneStorage(256, 50);
        System.out.println(phoneStorage.getEmptyStorage());
        phoneStorage.addMusic(6);
        System.out.println(phoneStorage.addMusics(5, 30));
    }
}
