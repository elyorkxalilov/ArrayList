package Lesson_1_2_3_4;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String str = str1.replace(str2, str3);
        System.out.println(str);
    }
}