package Lesson_6.Kasr;

public class KasrMain {
    public static void main(String[] args) {
        Kasr kasr = new Kasr(2,5);
        System.out.println(kasr.isShortFraction(5, 25));
        kasr.kasrPow(2,5,3);
    }
}
