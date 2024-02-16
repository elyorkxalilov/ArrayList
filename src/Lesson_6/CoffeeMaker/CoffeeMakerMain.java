package Lesson_6.CoffeeMaker;

public class CoffeeMakerMain {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(300, 20000, 5000);
        coffeeMaker.isMakeCoffees(1, 200, 25, 10);
        coffeeMaker.maxCount(1,200,25);
    }
}
