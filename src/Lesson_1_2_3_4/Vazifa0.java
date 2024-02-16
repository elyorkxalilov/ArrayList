package Lesson_1_2_3_4;

import java.util.Scanner;

public class Vazifa0 {
    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

//        int n = scanner.nextInt();
//        int k = 0;
//        int sum = 0;
//        while (k < n) {
//            ++k;
//            sum += k;
//        }
//        System.out.println(sum);


//        int n = scanner.nextInt();
//        int k = 0;
//        int sum = 0;
//        do {
//            ++k;
//            sum += k;
//        }while (k < n);
//        System.out.println(sum);


//        int n = scanner.nextInt();
//        int sum = 0;
//        int sakrash = scanner.nextInt();
//        int toxtash = scanner.nextInt();
//        for (int i = 0; i <= n; i++) {
//            if (i == sakrash) continue;
//            if (i == toxtash) break;
//            sum += i;
//        }
//        System.out.println(sum);


//        String str = scanner.nextLine();
//        switch (str) {
//            case "qish":
//                System.out.println("dekabr");
//                System.out.println("yanvar");
//                System.out.println("fevral");
//                break;
//            case "bahor":
//                System.out.println("mart");
//                System.out.println("aprel");
//                System.out.println("may");
//                break;
//            case "yoz":
//                System.out.println("iyyun");
//                System.out.println("iyyul");
//                System.out.println("avgust");
//                break;
//            case "kuz":
//                System.out.println("sentyabr");
//                System.out.println("oktyabr");
//                System.out.println("noyabr");
//                break;
//            default:
//                System.out.println("bunday fasl yoq");
//        }
        Scanner scanner = new Scanner(System.in);
//        /* int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//       int min = arr[0];
//        int max = arr[0];
//        for (int i = 0; i < n; i++) {
//            if (min > arr[i]) min = arr[i];
//            if (max < arr[i]) max = arr[i];
//        }
//        System.out.println("min =" + min);
//        System.out.println("max =" + max);*/ /*    int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] % 2 == 0) count++;
//        }
//        System.out.println("count =" + count);*/ /*     int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//        }
//        System.out.println("sum =" + sum);*/
//        /*
//        //  1
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int l;
//        for (int i = 0; i < n; i++) {
//            l = i;
//            arr[l] = arr[i] + 2;
//            System.out.print(arr[l] + " ");
//        }
//         */ /*
//        //  2
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        for (int i = n - 1; i >= 0; i-=2) {
//            System.out.print(arr[i] + " ");
//        }
//         */ /*
//        //3
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int k = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1 - k; j++) {
//                int temp = arr[j + 1];
//                if (arr[j] > arr[j + 1]) {
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//                System.out.print(arr[j] + " ");
//            }
//            System.out.println();
//            k++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//         */ /*
//        //4
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int had = arr[k];
//        for (int i = 0; i < n; i++) {
//            arr[i] = arr[i] + had;
//            System.out.print(arr[i] + " ");
//        }
//         */ /*
//        //5
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < n; i+=k) {
//            System.out.print(arr[i] + " ");
//        }
//         */
//        /*
//        //6
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int l = arr.length;
//        for (int i = 0; i < n; i++) {
//            if (l > arr[i]) {
//                l = arr[i];
//            }
//        }
//        if (l == arr.length) {
//            System.out.println(0);
//        } else {
//            System.out.println(l);
//        }
//         */ /*
//        //7
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int l = arr[0];
//        for (int i = 0; i < n; i += 2) {
//            if (l > arr[i]) {
//                l = arr[i];
//            }
//        }
//        System.out.println(l);
//         */ /*
//        // 8
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int[] barr = new int[n];
//        for (int i = 0; i < n; i++) {
//            if (arr[i] < 5) {
//                barr[i] = 2 * arr[i];
//            } else {
//                barr[i] = arr[i] / 2;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(barr[i] + " ");
//        }
//         */ /*
//        // 9
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int[] barr = new int[n - 1];
//        int l = 0;
//        for (int i = 0; i < n; i++) {
//            if (i != k) {
//                barr[l] = arr[i];
//                ++l;
//            }
//        }
//        for (int i = 0; i < n - 1; i++) {
//            System.out.print(barr[i] + " ");
//        }
//         */
    }
}