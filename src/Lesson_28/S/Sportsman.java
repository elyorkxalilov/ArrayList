package Lesson_28.S;

public class Sportsman extends Person {

    public Sportsman(String name, int age) {
        super(name, age);
    }
    public void toRun(String name, int age){
        System.out.println(getAge() + " yoshli " + getName() + " ismli sporchi yaxshi yugura oladi!");
    }
}
