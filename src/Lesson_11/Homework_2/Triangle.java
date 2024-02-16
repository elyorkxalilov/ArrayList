package Lesson_11.Homework_2;

public class Triangle extends Shape {
    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double surfaceShape() {
        double p1 = (getA() + getB() + getC()) / 2;
        return Math.sqrt(p1 * (p1 - getA()) * (p1 - getB()) * (p1 - getC()));
    }

    @Override
    public double perimetrShape() {
        return getA() + getB() + getC();
    }

    @Override
    public double getA() {
        return super.getA();
    }

    @Override
    public double getB() {
        return super.getB();
    }

    @Override
    public double getC() {
        return super.getC();
    }
}
