package Lesson_1_2_3_4;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print(Arrays.toString(tubArray(arr)));
    }

    public static int[] tubArray(int[] arr) {
        int[] newArray = new int[tubLength(arr)];
        int newIndexArray = 0;
        for (int value : arr) {
            if (isTub(value)) {
                newArray[newIndexArray++] = value;
            }
        }
        return newArray;
    }

    public static int tubLength(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (isTub(value)) {
                count++;
            }
        }
        return count;
    }


    public static boolean isTub(int arr) {
        for (int i = 2; i < arr; i++) {
            if (arr % i == 0) {
                return false;
            }
        }
        return true;
    }
}