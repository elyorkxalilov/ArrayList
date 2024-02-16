package Lesson_1_2_3_4;

import java.util.Random;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] b = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            b[i] = sum / (i+1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}