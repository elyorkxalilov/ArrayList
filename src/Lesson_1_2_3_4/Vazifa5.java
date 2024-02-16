package Lesson_1_2_3_4;

import java.util.Scanner;

public class Vazifa5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str = str1.toUpperCase();
        System.out.println(str.equals(str2));
    }
}