package Lesson_11.Car;

public abstract class Car {
    private int maxCapacity;
    private int busyCapacity;   // =bakda qncha benzin borligi

    public Car(int maxCapacity, int busyCapacity) {
        this.maxCapacity = maxCapacity;
        this.busyCapacity = busyCapacity;
    }

    public abstract int maxLongestWay(int a);
    public abstract int getMaxOilFromRefill();

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setBusyCapacity(int busyCapacity) {
        this.busyCapacity = busyCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getBusyCapacity() {
        return busyCapacity;
    }
}
