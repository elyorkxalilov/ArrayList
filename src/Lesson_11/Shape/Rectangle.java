package Lesson_11.Shape;

public class Rectangle extends Shape {
    public Rectangle(int a, int b) {
        super(a, b);
    }

    public Rectangle(int a) {
        super(a);
    }

    @Override
    public double getPerimetr() {
        return 2 * (getA() + getB());
    }

    @Override
    public double getSquare() {
        return getA() * getB();
    }

    @Override
    public double getSideCount() {
        return 4;
    }

    @Override
    public int getA() {
        return super.getA();
    }

    @Override
    public int getB() {
        return super.getB();
    }
}
