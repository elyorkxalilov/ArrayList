package Lesson_1_2_3_4;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] str = str1.split(" ");
        int k = str[0].length();
        String new1="";
        for (int i = 0; i < str.length; i++) {
            if(k>=str[i].length())
                new1=str[i];
        }
        System.out.println(new1);
    }
}