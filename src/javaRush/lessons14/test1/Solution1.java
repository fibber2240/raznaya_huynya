package javaRush.lessons14.test1;

import java.util.HashSet;

import static java.util.Arrays.asList;

public class Solution1 {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        boolean wordSearch = words.contains(word);
        if (wordSearch) {
            System.out.println("Слово " + word + " есть в множестве");
        } else {
            System.out.println("Слово " + word + " нет в множестве");
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
