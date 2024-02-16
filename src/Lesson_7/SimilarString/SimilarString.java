package Lesson_7.SimilarString;

public class SimilarString {
    char[] chars;

    public SimilarString(char[] chars) {
        this.chars = chars;
    }

    public SimilarString(String str) {
        this.chars = str.toCharArray();
    }

    boolean equals1(char[] mass) {
        int count = 0;
        if (chars.length != mass.length) {
            return false;
        } else {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == mass[i]) {
                    count++;
                }
            }
        }
        if (count == chars.length) return true;
        return false;
    }

    boolean equals2(char[] mass) {
        int count = 0;
        if (chars.length != mass.length) {
            return false;
        } else {
            for (int i = 0; i < chars.length; i++) {
                if ((chars[i] > 64 && chars[i] < 91)) {
                    if (chars[i] == mass[i]) {
                        count++;
                    } else if (chars[i] == mass[i + 32]) {
                        count++;
                    }
                }
            }
        }
        if (count == chars.length) return true;
        return false;
    }

    char[] subString1(int startIdex) {
        int index1 = 0;
        char arr1[] = new char[chars.length - startIdex];
        for (int i = startIdex; i < chars.length; i++) {
            arr1[index1++] = chars[i];
        }
        return arr1;
    }

    char[] subString2(int startIndex, int endIndex) {
        int index2 = 0;
        char arr2[] = new char[endIndex - startIndex];
        for (int i = startIndex; i < endIndex; i++) {
            arr2[index2++] = chars[i];
        }
        return arr2;
    }
}
