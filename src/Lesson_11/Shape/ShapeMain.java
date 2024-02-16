package Lesson_11.Shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4,5);
        System.out.println(rectangle.getPerimetr());
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getSideCount());

        Shape circle = new Circle(3);
        System.out.println(circle.getPerimetr());
        System.out.println(circle.getSquare());
        System.out.println(circle.getSideCount());
    }
}
