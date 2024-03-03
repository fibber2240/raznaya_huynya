package javaRush.metod.staticVariable.variableExample;

import java.util.Arrays;

public class Solution6 {
    public static void main(String[] args) {
        int [] ar = new int[5];
        String a = new String("1");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int oddSum = 0, evenSum = 0;
        int i = 0;

        while (i / 2 != 500) {
            i++;
            if (i % 2 == 1) {
                evenSum += i;
            }
            if (i % 2 == 0) {
                oddSum += i;
            }
        }
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}