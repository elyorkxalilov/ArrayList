package Lesson_11.Shape;

public abstract class Shape {
    private int a;
    private int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Shape(int a) {
        this.a = a;
    }

    public abstract double getPerimetr();

    public abstract double getSquare();

    public abstract double getSideCount();

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
