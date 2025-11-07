package me.code;

import java.util.Arrays;

public class CustomArrayList<E>{
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }


    public void add(int index, E element) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public void remove(int index) {
        Object item = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;

    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void clear () {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
        }

    public void display () {
        if (size == 0){
            System.out.println("Listan är tom");
            return;
        }

        for (int i = 0; i < size; i++){
            System.out.println(elements[i]);

        }
    }
}
