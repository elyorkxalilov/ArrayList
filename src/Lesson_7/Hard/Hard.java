package Lesson_7.Hard;

public class Hard {
    String Str;

    public Hard(String Str) {
        this.Str = Str;
    }

    public boolean Array() {
        char arr[] = Str.toCharArray();
        char arr1[] = new char[arr.length / 2 + 1];
        int count = 0;
        if ((arr.length % 2 == 0) &&
                (arr[0] != ')' || arr[0] != ']' || arr[0] != '}') &&
                (arr[arr.length - 1] != '(' || arr[arr.length - 1] != '[' || arr[arr.length - 1] != '{')) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '(') {
                    count++;
                    arr1[count] = arr[i];
                } else if (arr[i] == '{') {
                    count++;
                    arr1[count] = arr[i];
                } else if (arr[i] == '[') {
                    count++;
                    arr1[count] = arr[i];
                } else if (arr[i] == ')') {
                    int index = Str.charAt(i);
                    arr[i] = (char) (index - 1);
                    if (arr1[count] == arr[i]) {
                        count--;
                    } else {
                        return false;
                    }
                } else {
                    int index1 = Str.charAt(i);
                    arr[i] = (char) (index1 - 2);
                    if (arr1[count] == arr[i]) {
                        count--;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
// ({})([])[]
// ({[]})
// ([])
// (){}[]
//true
// ([{)]}
// false