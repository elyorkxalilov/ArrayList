package Lesson_25.MyArray;

import java.util.Arrays;

public class MyArray<E> implements List<E> {  // add, remov, search, contains, edit,


    @Override
    public boolean add(E ad) { 
        capacty();
        Object[] arr = new Object[capacty];
        int k = 0;
        for (int i = 0; i < size(); i++) {
            arr[k++] = objects[i];
        }
        arr[k] = ad;
        objects = arr;
        capacty();
        System.out.println(ad + " element qo`shildi!");
        return true;
    }

    @Override
    public boolean remove(E remov) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (remov == objects[i]) {
                count++;
            }
        }
        if (count > 0) {
            Object[] arr1 = new Object[size()];
            int k = 0;
            for (int i = 0; i < size; i++) {
                if (remov != objects[i]) {
                    arr1[k++] = objects[i];
                }
            }
            objects = arr1;
            size();
            System.out.println(remov + " element o`chirildi!");
            return true;
        } else {
            System.out.println(remov + " element topilmadi!");
            return false;
        }
    }

    @Override
    public boolean contains(E contain) {
        for (int i = 0; i < size(); i++) {
            if (contain == objects[i]) {
                System.out.println(contain + " element topildi!");
                return true;
            }
        }
        System.out.println(contain + " element topilmadi!");
        return false;
    }

    private Object[] objects;
    public int size;
    public int capacty;

    public MyArray(int capacty) {
        this.capacty = capacty;
        objects = new Object[capacty];
    }

    public MyArray() {
        capacty = 10;
        objects = new Object[capacty];
    }

    public MyArray(E[] e) {
        this.objects = e;
        capacty();
    }

    public boolean edit(int index, E edt) {
        if (index < size()) {
            Object[] arr2 = new Object[size()];
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    arr2[i] = edt;
                } else {
                    arr2[i] = objects[i];
                }
            }
            objects = arr2;
            System.out.println(index + " - index " + edt + " elementiga almashtirildi! ");
            return true;
        }
        System.out.println(index + " > " + size() + " xatolik!");
        return false;
    }

    public int search(E sarch) {
        for (int i = 0; i < size(); i++) {
            if (sarch == objects[i]) {
                System.out.println(sarch + " element topildi!");
                return i;
            }
        }
        System.out.println(sarch + " element topilmadi!");
        return -1;
    }

    public int size() {
        int s = 0;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                s++;
            }
        }
        size = s;
        return size;
    }

    public void capacty() {
        if (capacty - size() <= 0) {
            capacty = (capacty * 3 / 2) + 1;
        }
    }

    @Override
    public String toString() {
        Object[] objects1 = new Object[size()];
        for (int i = 0; i < size(); i++) {
            objects1[i] = objects[i];
        }
        return Arrays.toString(objects1);
    }
}
