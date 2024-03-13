package javaRush.lessons13.test3;


import java.util.ArrayList;
import java.util.Collections;

/*
Переворачивание данных
*/

public class Solution {
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        Collections.reverse(numbers);
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
