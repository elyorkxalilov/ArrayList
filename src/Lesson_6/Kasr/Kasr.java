package Lesson_6.Kasr;

public class Kasr {
    int surat;
    int maxraj;

    public Kasr(int surat, int maxraj) {
        this.surat = surat;
        this.maxraj = maxraj;
    }

    public boolean isShortFraction(int surat, int maxraj) {
        if (surat % ekub(surat, maxraj) == 0 && maxraj % ekub(surat, maxraj) == 0) {
            System.out.println("Kasr qisqaradi!");
            return true;
        }
        System.out.println("Kasr qisqarmaydi!");
        return false;
    }

    public void kasrPow(int surat, int maxraj, int digree) {
        int S = (int) Math.pow(surat, digree);
        int M = (int) Math.pow(maxraj, digree);
        System.out.println(surat + " / " + maxraj + " kasrni " + digree + " - darajasi " + S + " / " + M + " ga teng!");
    }

    private int ekub(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        if (a != 1 && b != 1) {
            return a;
        }
        return 0;
    }
}
