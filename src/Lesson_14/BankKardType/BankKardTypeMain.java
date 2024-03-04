package Lesson_14.BankKardType;

import java.util.Arrays;
import java.util.Scanner;

public class BankKardTypeMain {
    public static void main(String[] args) {

        BankKardType bankKardTypeU = BankKardType.UZKARD;
        BankKardType bankKardTypeH = BankKardType.HUMO;
        BankKardType bankKardTypeV = BankKardType.VISA;
        BankKardType bankKardTypeA = BankKardType.ATTO;

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Siz qanaqa karta buyurtma berasiz?");

        System.out.print("1 -> " + bankKardTypeU);
        System.out.print(", 2 -> " + bankKardTypeH);
        System.out.print(", 3 -> " + bankKardTypeV);
        System.out.println(", 4 -> " + bankKardTypeA);

        switch (n = scanner.nextInt()) {
            case 1:
                System.out.println("Siz " + bankKardTypeU + " kartasini tanladingiz!");
                break;
            case 2:
                System.out.println("Siz " + bankKardTypeH + " kartasini tanladingiz!");
                break;
            case 3:
                System.out.println("Siz " + bankKardTypeV + " kartasini tanladingiz!");
                break;
            case 4:
                System.out.println("Siz " + bankKardTypeA + " kartasini tanladingiz!");
                break;
            default:
                System.out.println("Sizda 4 sonigacha tanlash huquqi bor!");
        }
    }
}
