package Lesson_13.Icecream;

public class Piece {
    private int weightIcecream;  // bir dona murqaymoq vazni
    private int priceIcecream;  // bir dona muzqaymoq narxi

    public Piece(int weightIcecream, int priceIcecream) {
        this.weightIcecream = weightIcecream;
        this.priceIcecream = priceIcecream;
    }

    public int getWeightIcecream() {
        return weightIcecream;
    }

    public int getPriceIcecream() {
        return priceIcecream;
    }
}
