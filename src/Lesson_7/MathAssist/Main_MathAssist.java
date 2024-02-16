package Lesson_7.MathAssist;

import java.util.Random;
import java.util.Scanner;

public class Main_MathAssist {
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
        MathAssistVoris mathAssistVoris = new MathAssistVoris();
        System.out.println(mathAssistVoris.min(2, -4));
        System.out.println(mathAssistVoris.min(0, 5, -3));
        System.out.println(mathAssistVoris.min(arr));
        mathAssistVoris.swap(3, -5);
        mathAssistVoris.swap(2.3, 5.4);
    }
}
