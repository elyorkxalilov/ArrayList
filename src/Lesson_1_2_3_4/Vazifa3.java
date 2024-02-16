package Lesson_1_2_3_4;

import java.util.Scanner;

public class Vazifa3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] st = str.split("");
        int l = 0;
        for (int i = 0; i < st.length; i++) {
            char[] s = st[i].toCharArray();
            for (int j = 0; j < s.length; j++) {
                if (s[j] == 'a' || s[j] == 'b' || s[j] == 'i' || s[j] == 'o' ||
                        s[j] == 'e' || s[j] == 'u' || s[j] == 'o'+'`'){
                    ++l;
                }
            }
        }
        System.out.println(l);
    }
}