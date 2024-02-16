package Lesson_1_2_3_4;

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] str = str1.split(" ");
        for (int i = 0; i < str.length; i++) {
            char[] s = str[i].toCharArray();
            for (int j = 0; j < s.length; j++) {
                System.out.print(s[j] + " ");

            }
        }
    }
}