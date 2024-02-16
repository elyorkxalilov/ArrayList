package Lesson_8.Basket;
class Capacity {
    private int basketCapacity;  // basket capacity = savat sig`mi

    public Capacity(int basketCapacity) {
        this.basketCapacity = basketCapacity;
    }

    public int getBasketCapacity() {
        return basketCapacity;
    }

    public void setBasketCapacity(int basketCapacity) {
        this.basketCapacity -= basketCapacity;
    }
}
