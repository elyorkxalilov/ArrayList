package Lesson_8.Basket;

class Basket {
//    private Capacity capacity;
//    private Fruit fruit;
//    private Fruit[] fruits;
//    private Fruit[] a = new Fruit[10];
//    private static int[] b = new int[10];
//
//
//    public Lesson_8.Basket(Capacity capacity, Fruit fruit) {
//        this.capacity = capacity;
//        this.fruit = fruit;
//        this.fruits = new Fruit[]{fruit};
//        showInfo();
//    }
//    public Lesson_8.Basket(Capacity capacity) {
//        this.capacity = capacity;
//        this.fruits = new Fruit[]{};
//    }
//    public boolean isFull(){
//        int sumWeight = 0;
//        for (Fruit value : fruits) {
//            sumWeight += value.getWeight();
//        }
//        return sumWeight == capacity.getBasketCapacity();
//    }
//    public boolean isEmpty(){
//        return this.fruits.length == 0;
//    }
//    public void showInfo(){
//        System.out.println(Arrays.toString(fruits));
//    }
//    public void addFruit(Fruit fruit){
//       if (!isFull()) {
//           Fruit[] arrayF = new Fruit[this.fruits.length + 1];
//           int index = 0;
//           for (Fruit value : fruits){
//               arrayF[index++] = value;
//           }
//           arrayF[index] = fruit;
//           this.fruits = arrayF;
//           showInfo();
//       } else {
//
//       }
//    }
    Capacity maxWeight;   //  maxWeight = maxsimal vazn
    private int count = 0;
    int size;

    Fruit[] fruts1 = new Fruit[5];

    public Basket(Capacity maxWeight) {
        this.maxWeight = maxWeight;
        size = maxWeight.getBasketCapacity();
    }

    public boolean isFull() {
        return maxWeight.getBasketCapacity() == 0;
    }

    public boolean isEmpty() {
        return size == maxWeight.getBasketCapacity();
    }

    public void showMessage(String message) {  // message = xaba
        System.out.println(message);
    }

    public void addFruit(Fruit fruit) {
        if (maxWeight.getBasketCapacity() >= fruit.getWeight()) {
            fruts1[count++] = fruit;
            maxWeight.setBasketCapacity(fruit.getWeight());
            showMessage("Savatga " + fruit.getWeight() + " kg " + fruit.getColor() + " " + fruit.getName() + " qo`shildi!");
            if (maxWeight.getBasketCapacity() == 0) {
                System.out.println("Savatga joy qolmadi!");
            } else {
                System.out.println("Savatga " + maxWeight.getBasketCapacity() + " kg yuk sig`adi!");
            }
        } else {
            showMessage("Savatga " + fruit.getWeight() + " kg " + fruit.getColor() + " " + fruit.getName() + " qo`shilmadi!");
        }
    }

    public void addFruits(Fruit[] fruits) {
        for (int i = 0; i < fruits.length; i++) {
            if (maxWeight.getBasketCapacity() >= fruits[i].getWeight()) {
                maxWeight.setBasketCapacity(fruits[i].getWeight());
                showMessage(fruits[i] + " meva qo`shildi!");
            } else {
                showMessage("meva qo`shilmadi");
            }
        }
    }

    public void showFruits() {
        for (int i = 0; i < count; i++) {
            showMessage("Savatga " + fruts1[i].getWeight() + " kg " + fruts1[i].getColor() + " " + fruts1[i].getName() + " bor");
        }
    }
}