package Lesson_10.FoodAndReceipt;

public class Food extends Ingredient {  //  food=ovqat; reciept=chek;

    private Receipt reciept;
    private int count;

    public Food(int capacity, Receipt reciept) {
        super(capacity);
        this.reciept = reciept;
    }

    public int getCount() {
        return count;
    }

    public Receipt getReciept() {
        return reciept;
    }
}