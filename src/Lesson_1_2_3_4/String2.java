package Lesson_1_2_3_4;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {

        Scanner scannerForNumber = new Scanner(System.in);
        int N1 = scannerForNumber.nextInt();
        int N2 = scannerForNumber.nextInt();

        Scanner scannerForString = new Scanner(System.in);
        String str1 = scannerForString.nextLine();
        String str2 = scannerForString.nextLine();

        String str = str1.substring(0, N1) + str2.substring((str2.length() - N2));
        System.out.println(str);
    }
}