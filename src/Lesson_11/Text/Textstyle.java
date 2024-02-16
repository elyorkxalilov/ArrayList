package Lesson_11.Text;

public abstract class Textstyle extends Color {

    String textStyle;

    public Textstyle(String colorName, String textStyle) {
        super(colorName);
        this.textStyle = textStyle;
    }
}
