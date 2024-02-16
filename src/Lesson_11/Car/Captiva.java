package Lesson_11.Car;

public class Captiva extends Car {
    int maxBakCaptiva;
    public Captiva(int maxCapacity, int busyCapacity) {
        super(maxCapacity, busyCapacity);
        this.maxBakCaptiva = maxCapacity;
    }

    @Override
    public int maxLongestWay(int sarfCaptiva) {
        return getBusyCapacity() * 100 / sarfCaptiva;
    }

    @Override
    public int getMaxOilFromRefill() {
        return maxBakCaptiva - getBusyCapacity();
    }

    @Override
    public int getMaxCapacity() {
        return super.getMaxCapacity();
    }

    @Override
    public int getBusyCapacity() {
        return super.getBusyCapacity();
    }
}
