package Lesson_8.GasStation;

class GasStation {
    private int petrolSizeGas;

    public GasStation(int petrolSizeGas) {
        this.petrolSizeGas = petrolSizeGas;
    }

    public boolean isEmpty() {
        return getPetrolSizeGas() > 0;
    }

    public boolean toSell(Car car) {
        if (car.capacity.getCapacity() <= getPetrolSizeGas()) {
            setPetrolSizeGas(getPetrolSizeGas() - car.capacity.getCapacity());
            return true;
        }
        return false;
    }

    public void addPetrol(int addValue) {
        petrolSizeGas = petrolSizeGas + addValue;
        System.out.println("Shaxobchaga yoqilg`i qo`shildi");

    }

    public boolean isSell(Car[] cars) {
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (petrolSizeGas < cars[i].capacity.getCapacity()) {
                System.out.println(count + " ta mashinaga yoqilg`i to`ldirildi");
                System.out.println(cars[i].capacity.getCapacity() - petrolSizeGas + " litr benzin yetmadi uning bak sig`imi " + cars[i].capacity.getCapacity());
                return false;
            } else {
                petrolSizeGas -= cars[i].capacity.getCapacity();
                count++;
            }
        }
        System.out.println("Hamma mashinaga yoqilg'i to`ldirildi");
        return true;
    }

    public int getPetrolSizeGas() {
        return petrolSizeGas;
    }

    public void setPetrolSizeGas(int petrolSizeGas) {
        this.petrolSizeGas = petrolSizeGas;
    }
}
