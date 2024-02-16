package Lesson_11.Car;

public class Malibu extends Car {
    int maxBakMalibu;

    public Malibu(int maxCapacity, int busyCapacity) {
        super(maxCapacity, busyCapacity);
        this.maxBakMalibu = maxCapacity;
    }

    @Override
    public int maxLongestWay(int sarfMalibu) {
        return getBusyCapacity() * 100 / sarfMalibu;
    }

    @Override
    public int getMaxOilFromRefill() {
        return maxBakMalibu - getBusyCapacity();
    }

    public boolean isFull() {
        return maxBakMalibu == getBusyCapacity();
    }

    public boolean isEmpty() {
        return getBusyCapacity() == 0;
    }
}
