package javaRush.metod.doWhile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        int sum =0;
        do {
            value = scanner.nextInt();
            sum += value;

        } while (value != 0);
        System.out.println(sum);
    }
}
