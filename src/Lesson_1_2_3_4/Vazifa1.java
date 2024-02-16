package Lesson_1_2_3_4;

import java.util.Scanner;

public class Vazifa1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();          // 2,
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("bir xil");
        } else {
            System.out.println("har xil");
        }
    }
}