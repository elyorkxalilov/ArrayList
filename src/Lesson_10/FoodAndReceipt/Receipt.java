package Lesson_10.FoodAndReceipt;

public class Receipt {

    private final int size = 20;
    Receipt[] receipts = new Receipt[]{};

    public int addIngrdient(){
        return 0;
    }
    public boolean isFull(){
        return receipts.length == 20;
    }
    public boolean isEmpty(){
        return receipts.length == 0;
    }
    public void show(){
        for (int i = 0; i < receipts.length; i++) {
            System.out.println(receipts[i] + ", ");
        }
    }
}
