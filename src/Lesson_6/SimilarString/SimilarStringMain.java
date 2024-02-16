package Lesson_6.SimilarString;

public class SimilarStringMain {
    public static void main(String[] args) {

        char[] chars = new char[]{'H','e','l','l','o'};
        char[] mass = new char[]{'e','l','l'};
        SimilarString similarString = new SimilarString(chars);
//        System.out.println(similarString.addCharMassiv(mass));
//        System.out.println(similarString.addChar('o'));
        System.out.println(similarString.lengthString());
        System.out.println(similarString.contains(mass));
    }
}
