package Lesson_6.PhoneStorage;

public class PhoneStorage {
    int storage;     // storage=saqlash
    int busyPart;    // busy=band qismi

    public PhoneStorage(int storage, int busyPart) {
        this.storage = storage;
        this.busyPart = busyPart;
    }

    public int getEmptyStorage() {
        return storage - busyPart;
    }

    public void addMusic(int musicSize) {
        if (getEmptyStorage() >= musicSize) {
            storage = storage - musicSize;
            System.out.println("Muzika qo`shildi!");
        } else {
            System.out.println("Joy yetarli emas!");
        }
    }

    public boolean addMusics(int musicSize, int count) {
        if (getEmptyStorage() >= count * musicSize) {
            System.out.println(count + " ta muzikani qo`sha oladi!");
            return true;
        }
        System.out.println(count + " ta muzika qo`shib bo`lmaydi!");
        return false;
    }
}
