package Lesson_1_2_3_4;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = 0;
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[j];
                    min = j;
                }
            }
            arr[i] = arr[min];
            arr[min] = temp;
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr));
        }
    }
}