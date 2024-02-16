package Lesson_28.S;

public class PersonMain {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Ali", 28);
        teacher.toTeach("Ali");

        Sportsman sportsman = new Sportsman("Elyor", 23);
        sportsman.toRun("Elyor", 23);
    }
}
