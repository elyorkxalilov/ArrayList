package Lesson_11.Shape;

public class Circle extends Shape {
    public Circle(int a) {
        super(a);
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * getA();
    }

    @Override
    public double getSquare() {
        return Math.PI * getA() * getA();
    }

    @Override
    public double getSideCount() {
        return 0;
    }

    @Override
    public int getA() {
        return super.getA();
    }
}
