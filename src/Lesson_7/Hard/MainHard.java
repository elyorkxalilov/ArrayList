package Lesson_7.Hard;

import java.util.Scanner;

public class MainHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Str = scanner.next();
        HardVoris hardVoris = new HardVoris(Str);
        System.out.println(hardVoris.Array());
    }
}
