package Lesson_9.Car;

public class Parking {
    Car car;
    private int maxCount;
    int count;
    Car[] cars = new Car[]{};

    public Parking(int maxCount) {
        this.maxCount = maxCount;
        count = maxCount;
    }

    public boolean isEmpty() {
        return count == getMaxCount();
    }


    public boolean isFull() {
        return getMaxCount() == 0;
    }

    public void show() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Mashina nomi-> " + car.getCarName() + " va nomeri-> " + car.getCarNumber());
        }
    }

    public void addCar(Car car) {
        if (!isFull()) {
            int index = 0;
            Car[] newCar = new Car[cars.length + 1];
            for (Car value : cars) {
                newCar[index++] = value;
            }
            cars = new Car[]{car};
            cars = newCar;
            setMaxCount(1);
            System.out.println(car.getCarName() + " nomli " + car.getCarNumber() + " nomerli mashina avtoturargohga qabul qilindi!");
            if (isFull()) {
                System.out.println("Avtoturargohda joy qolmadi!");
            }
        } else {
            System.out.println("Avtoturargohda joy yo`q!");
        }
    }

    public void addCars(Car[] cars1) {
        if (getMaxCount() >= cars.length) {
            int index1 = 0;
            Car[] arrCars1 = new Car[cars.length + cars1.length];
            for (int i = 0; i < cars.length; i++) {
                arrCars1[index1++] = cars[i];
            }
            for (int i = 0; i < cars1.length; i++) {
                arrCars1[index1++] = cars1[i];
            }
            cars = arrCars1;
            setMaxCount(cars1.length);
            System.out.println("Avtoturargohga " + cars1.length + " ta mashina qo`shildi!");
        } else {
            System.out.println((cars1.length - getMaxCount()) + " ta mashina ortiqcha!");
        }
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount -= maxCount;
    }
}
