package javaRush.lessons13.test2;

public class Solution {
//    public static void main(String[] args) {
//        String string = "Думаю, это будет новой фичей." +
//                "Только не говорите никому, что она возникла случайно.";
//
//        System.out.println("Количество цифр в строке : " + countDigits(string));
//        System.out.println("Количество букв в строке : " + countLetters(string));
//        System.out.println("Количество пробелов в строке : " + countSpaces(string));
//    }
//
//    public static int countDigits(String string) {;
//        char[] charArray = string.toCharArray();
//        int count = 0;
//        for (int i = 0; i < charArray.length; i++) {
//            char charCount = charArray[i];
//            if (Character.isDigit(charCount)){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int countLetters(String string) {
//        char[] charArray = string.toCharArray();
//        int count = 0;
//        for (int i = 0; i < charArray.length; i++) {
//            char charCount = charArray[i];
//            if (Character.isLetter(charCount)){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int countSpaces(String string) {
//        char[] charArray = string.toCharArray();
//        int count = 0;
//        for (int i = 0; i < charArray.length; i++) {
//            char charCount = charArray[i];
//            if (Character.isWhitespace(charCount)){
//                count++;
//            }
//        }
//        return count;
//    }
//}
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'б');
        compare('р', 'в');
        compare('ы', 'ы');
    }

    public static void compare(Character first, Character second) {
        if (first.equals(second)) {
            System.out.println("равны");
        } else if (first > second) {
            System.out.println("больше");
        } else if (first < second) {
            System.out.println("меньше");
        } else {
            System.out.println("А как такое может быть???");
        }
    }
}
