package Lesson_8.Basket;
class Fruit {
    private String name;   // name=nomi
    private String color;   // color=rangi
    private int weight;     // weight=vazni

    public Fruit(int weight, String color, String name) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

}