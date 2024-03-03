package javaRush.metod.string_class;

public class SolutionStringBuilder {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder str = new StringBuilder(string);
        return str.reverse().toString();
    }
}
