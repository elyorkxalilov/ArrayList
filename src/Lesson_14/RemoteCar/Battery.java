package Lesson_14.RemoteCar;

class Battery extends Car {
    private int I;
    static double U = 1.5;
    int n;
    private int[] N = new int[numberOfBatterySlots];

    Battery(int numberOfBatterySlots, int matorPower, int I) {
        super(numberOfBatterySlots, matorPower);
        this.I = I;
        n = numberOfBatterySlots;
    }

    public boolean run(int time) {
        if (isFull()){
            return true;
        }
        return false;
    }

    int count = 0;
    public boolean addBattery() {
        if (N.length > count) {
            ++count;
            setNumberOfBatterySlots(1);
            return true;
        }
        return false;
    }
    public int getBatteryInfo() {
        return 100 * (n - getnumberOfBatterySlots()) / n;
    }
    public boolean isFull(){
        return getnumberOfBatterySlots() == 0;
    }
}
