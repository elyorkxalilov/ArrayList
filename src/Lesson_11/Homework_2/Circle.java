package Lesson_11.Homework_2;

public class Circle extends Shape {
    public Circle(double a) {
        super(a);
    }

    @Override
    public double surfaceShape() {
        return Math.sqrt(Math.PI * getA() * getA());
    }

    @Override
    public double perimetrShape() {
        return 2 * Math.PI * getA();
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
