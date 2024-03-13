package javaRush.lessons13.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        elements = Arrays.copyOf(elements, capacity *=1.5);
    }
}
