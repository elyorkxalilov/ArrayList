package Lesson_28.S;

public class Teacher extends Person{

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void toTeach(String name){
        System.out.println(getName() + " yaxshi dars bera oladi!");
    }

}
