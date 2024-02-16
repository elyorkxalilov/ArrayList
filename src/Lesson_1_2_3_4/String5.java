package Lesson_1_2_3_4;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] str = str1.split(" ");
        System.out.println(str.length);
//        int k = 0;
//        for (int i = 0; i < str.length; i++) {
//            k++;
//        }
//        System.out.println(k);
    }
}