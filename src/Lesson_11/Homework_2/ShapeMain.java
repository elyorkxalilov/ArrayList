package Lesson_11.Homework_2;

public class ShapeMain {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3,4,5);
        System.out.println(triangle.perimetrShape());
        System.out.println(triangle.surfaceShape());

        Shape circle = new Circle(2);
        System.out.println(circle.perimetrShape());
        System.out.println(circle.surfaceShape());
    }
}
