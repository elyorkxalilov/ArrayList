package Lesson_7.SimilarString;

public class MainSimilarString {
    public static void main(String[] args) {

        SimilarString similarString = new SimilarString("salom");
        String str = "hello";
        char[] arr = str.toCharArray();
        System.out.println(similarString.equals1(arr));
        System.out.println(similarString.equals2(arr));
        System.out.println(similarString.subString1(2));
        System.out.println(similarString.subString2(2, 4));
    }
}
