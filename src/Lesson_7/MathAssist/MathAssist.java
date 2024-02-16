package Lesson_7.MathAssist;

public class MathAssist {
    int min(int a, int b) {
        if (a > b) return b;
        return a;
    }

    int min(int a, int b, int c) {
        if (a > b && a > c) {
            if (b > c) return c;
            return b;
        } else if (c > a && c > b) {
            if (a > b) return b;
            return a;
        } else {
            if (a > c) return c;
            return a;
        }
    }

    int min(int[] mass) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i])
                min = mass[i];
        }
        return min;
    }

    void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    void swap(double a, double b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
