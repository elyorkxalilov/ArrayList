package Lesson_13.Icecream;

public abstract class Milk {
    private int milkSize;  // sut hajmi
    private int milkSumm;  // 1 litr sut narxi

    public Milk(int milkSize, int milkSumm) {
        this.milkSize = milkSize;
        this.milkSumm = milkSumm;
    }

    public int getMilkSize() {
        return milkSize;
    }

    public int getMilkSumm() {
        return milkSumm;
    }
}
