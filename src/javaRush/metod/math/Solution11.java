package javaRush.metod.math;

public class Solution11 {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    //    public static void printNumbers() throws InterruptedException {
//        int i = 10;
//        for (i = 1; i <= 9; i++){
//            System.out.println(i);
//            Thread.sleep(1, 300_000);
//        }
//        System.out.println(i);
//    }
    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i < 10) {
                Thread.sleep(1, 300_000);
            }
        }
    }
}
