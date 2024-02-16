package Lesson_1_2_3_4;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[arrLength(a, b)];
        int k = 0;
        for (int i = a; i < b; i++) {
            for (int j = 0; j < i; j++) {
                arr[k++] = i;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int arrLength(int a, int b) {
        int count = 0;
        for (int i = a; i < b; i++) {
            count += i;
        }
        return count;
    }
}