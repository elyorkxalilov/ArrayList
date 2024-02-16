package Lesson_7.IntegerAssist;

public class IntegerAssist {
    int a;

    public IntegerAssist(int a) {
        this.a = a;
    }

    public int reverseMethod() {
        int A = 0;
        if (a > 0) {
            while (a > 0) {
                A = A * 10 + a % 10;
                a /= 10;
            }
        } else {
            a = -a;
            while (a > 0) {
                A = A * 10 + a % 10;
                a /= 10;
            }
            return (-A);
        }
        return A;
    }
}
