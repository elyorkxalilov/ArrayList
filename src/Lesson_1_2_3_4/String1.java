package Lesson_1_2_3_4;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // chiq 8,9,10
        String str1 = scanner.nextLine();           // mu 2
        String str2 = scanner.next();
        str1 = str1.replace(str2, "GITA");
        System.out.println(str1);
    }
}