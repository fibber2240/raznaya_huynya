package javaRush.lessons13.test3.test4;
import java.util.ArrayList;
import java.util.Arrays;

/*
Прощай, Паскаль
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        programmingLanguages.remove("Pascal");
        System.out.println(programmingLanguages.toString());
    }
}
