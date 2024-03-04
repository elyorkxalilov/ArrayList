package Lesson_6.SimilarString;

public class SimilarString {
    char[] chars;

    public SimilarString(char[] chars) {
        this.chars = chars;
    }

    public char[] addCharMassiv(char[] mass) {
        char[] chars1 = new char[lengthString() + mass.length];
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            chars1[k++] = chars[i];
        }
        for (int i = 0; i < mass.length; i++) {
            chars1[k++] = mass[i];
        }
        chars = chars1;
        return chars;
    }

    public char[] addChar(char a) {
        char[] chars2 = new char[lengthString() + 1];
        for (int i = 0; i < chars.length; i++) {
            chars2[i] = chars[i];
        }
        chars2[chars.length] = a;
        chars = chars2;
        return chars;
    }

    public boolean equals(char[] mass) {
        if (mass.length == chars.length) {
            int index = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == mass[i]) {
                    index++;
                }
            }
            if (index == chars.length) {
                return true;
            }
        }
        return false;
    }

    public int lengthString() {
        return chars.length;
    }

    public boolean contains(char[] mass) {
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if ((int) chars[i] == (int) mass[j]) {
                    ++index;
                    ++i;
                    if (index == mass.length) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }
}