package Lesson_11.Student;

public class StudentMain {
    public static void main(String[] args) {

        Lesson lesson = new Lesson(6,"matematika");
        Student student = new Student("elyor",23,28);
        System.out.println(student.addLesson(lesson));
        System.out.println(student.isFullLesson());
        student.getrLesson();
        System.out.println(student.getLimit());
        student.getInfo();

    }
}
