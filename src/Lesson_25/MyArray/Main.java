package Lesson_25.MyArray;

public class Main {
    public static void main(String[] args) {

        MyArray<Integer> arrays = new MyArray<>();

        arrays.add(1);
        arrays.add(2);
        arrays.add(3);
        arrays.add(4);
        arrays.add(5);
        arrays.add(6);
        arrays.add(7);
        arrays.add(8);
        arrays.add(9);
        arrays.add(10);
        arrays.add(11);
        arrays.add(12);
        arrays.add(13);
        arrays.add(14);
        arrays.add(11);
        arrays.add(11);
        System.out.println(arrays.capacty);
        System.out.println(arrays.size());
        System.out.println(arrays);

        arrays.remove(3);
        System.out.println(arrays);

        System.out.println(arrays.contains(4));

        arrays.edit(7, 1);
        System.out.println(arrays);

        System.out.println(arrays.search(10));

    }
}
