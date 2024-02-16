package Lesson_8.Basket;

public class BasketMain {
    public static void main(String[] args) {

        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Fruit(5, "sariq", "banan");
        fruits[1] = new Fruit(15, "gilos", "qizil");
        fruits[2] = new Fruit(25, "mandarin", "oranjivi");
        fruits[3] = new Fruit(20, "mandarin1", "oranjivi1");
        fruits[4] = new Fruit(10, "mandarin2", "oranjivi2");

        Basket basket = new Basket(new Capacity(100));
        System.out.println(basket.isFull());
        System.out.println(basket.isEmpty());
        basket.addFruit(new Fruit(10, "yashil", "olma"));
        basket.addFruit(new Fruit(20, "sariq", "nok"));
        basket.addFruit(new Fruit(70, "sariq1", "nok1"));
        basket.addFruit(new Fruit(80, "sariq2", "nok2"));
        basket.showMessage("----------------");
        basket.addFruits(fruits);
        basket.showFruits();
        System.out.println(basket.isFull());
        System.out.println(basket.isEmpty());
    }
}
