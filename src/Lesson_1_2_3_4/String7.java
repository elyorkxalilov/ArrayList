package Lesson_1_2_3_4;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        str1 = str1.replaceAll("\\s+"," ").trim();
        System.out.println(str1);
    }
}