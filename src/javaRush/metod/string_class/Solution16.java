package javaRush.metod.string_class;

public class Solution16 {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        if (first.intern()==second.intern()){
            return true;
        } else {
            return false;
        }
    }
}
