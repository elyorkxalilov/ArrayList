package Lesson_1_2_3_4;

import java.util.Random;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] brr = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                brr[k++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                brr[k++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}