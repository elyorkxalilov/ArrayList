package Lesson_11.Student;

public class Lesson extends Limit{
    String lessonName;

    public Lesson(int time, String lessonName) {
        super(time);
        this.lessonName = lessonName;
    }
}
