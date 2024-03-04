package Lesson_14.RemoteCar;

class Car {
    int numberOfBatterySlots;   // battery uchun joy soni
    int matorPower;    // mator quvvati

    public Car(int numberOfBatterySlots, int matorPower) {
        this.numberOfBatterySlots = numberOfBatterySlots;
        this.matorPower = matorPower;
    }

    public int getnumberOfBatterySlots() {
        return numberOfBatterySlots;
    }

    public void setNumberOfBatterySlots(int numberOfBatterySlots) {
        this.numberOfBatterySlots -= numberOfBatterySlots;
    }

    public int getmatorPower() {
        return matorPower;
    }
}
