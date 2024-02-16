package Lesson_11.Student;

public class Student {
    private String studentName;
    private int age;
    private int studentLimit;
    private Lesson lesson;
    int student_Limit;
    String[] studentLessons = new String[]{};

    public Student(String studentName, int age, int studentLimit) {
        this.studentName = studentName;
        this.age = age;
        this.studentLimit = studentLimit;
        student_Limit = studentLimit;
    }
    public boolean addLesson(Lesson lesson){
       if (studentLimit >= lesson.getTime()) {
           int index = 0;
         String[] str = new String[studentLessons.length + 1];
           for (int i = 0; i < studentLessons.length; i++) {
               str[index++] = studentLessons[i];
           }
           str[index] = lesson.lessonName;
           studentLessons = str;
           setStudentLimit(lesson.getTime());
           return true;
       }
       return false;
    }

    public boolean isFullLesson(){
        return getStudentLimit() == 0;
    }
    public void getrLesson(){
        for (int i = 0; i < studentLessons.length; i++) {
            System.out.println(i+1 + " - " + studentLessons[i] + "\n");
        }
    }

    public int getLimit(){
        return getStudentLimit();
    }
     public void getInfo(){
         System.out.println("Name: " + getStudentName() + ", Age: " + getAge() + ", Limit: " + getLimit() + "/" + student_Limit + "!");
     }


    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public int getStudentLimit() {
        return studentLimit;
    }

    public void setStudentLimit(int studentLimit) {
        this.studentLimit -= studentLimit;
    }

    public Lesson getLesson() {
        return lesson;
    }
}
