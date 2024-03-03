package javaRush.metod.math;

import java.util.Arrays;
import java.util.Scanner;

public class Solution8 {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        Arrays.sort(ints);
        int min = Math.min(ints[0], ints[1]);
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int [] arr = new int[10];
        for (int n = 0; n < arr.length; n++){
            i = scanner.nextInt();
            arr [n] = i;
        }
        return arr;
    }
}

