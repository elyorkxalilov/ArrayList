package Lesson_10.NotePad;

public class Pen {      // pen= qalam

   private String penColor;
    public Pen(String penColor) {
        this.penColor = penColor;
    }

    public String getPenColor() {
        return penColor;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "penColor='" + penColor + '\'' +
                '}';
    }
}
