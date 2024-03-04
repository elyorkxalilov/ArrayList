package Lesson_14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        String s = "";
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
           if (arr[i] == arr[i + 1] + 1){
               count++;
           } else {

           }
        }
    }
}
