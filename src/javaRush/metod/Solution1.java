package javaRush.metod;

public class Solution1 {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        for (int i = array.length - 1, j = 0; i > array.length / 2 - 1; i--, j++) {
            int result = array[i];
            array[i] = array[j];
            array[j] = result;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
