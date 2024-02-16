package Lesson_6.CoffeeMaker;

public class CoffeeMaker {
    int water;    // suv
    int sugar;    // shakar
    int coffee;   // kofe

    public CoffeeMaker(int water, int sugar, int coffee) {
        this.water = water;
        this.sugar = sugar;
        this.coffee = coffee;
    }

    public boolean isMakeCoffees(int oneWater, int oneSugar, int oneCoffee, int count) {
        if (water - oneWater * count >= 0 && sugar - oneSugar >= 0 && coffee - oneCoffee >= 0) {
            System.out.println(count + " ta kofe tayyorlash mumkin!");
            return true;
        }
        System.out.println(count + " ta kofe tayyorlab bo`lmaydi!");
        return false;
    }

    public void maxCount(int oneWater, int oneSugar, int onrCoffee) {
        int watercount = water / oneWater;
        int sugarcount = sugar / oneSugar;
        int coffeecount = coffee / onrCoffee;
        if (watercount > sugarcount && sugarcount > coffeecount){
           showInfo(coffeecount);
        } else if (watercount > coffeecount && coffeecount > sugarcount){
            showInfo(sugarcount);
        } else {
            showInfo(watercount);
        }
    }

    private void showInfo(int count) {
        System.out.println("maksimal " + count + " ta kofe tayyorlash mumkin!");
    }
}
