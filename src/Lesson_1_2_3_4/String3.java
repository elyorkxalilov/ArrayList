package Lesson_1_2_3_4;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String C = scanner.next();
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = str1.replace(C, (C + str2));
        System.out.println(str1);
    }
}