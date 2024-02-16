package Lesson_11.Text;

public class TextMain {
    public static void main(String[] args) {
        Pen pen = new Pen("qora", "bosma");  //printed = bosma
        Text text = new Text(pen);
        text.add("Salom android");
        text.add("va java");
        text.show();
        System.out.println(text.count());
        System.out.println(text.removeLine("va"));
        text.show();
        text.clear();
        text.show();
    }
}
