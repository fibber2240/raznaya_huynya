package javaRush.metod.math;

public class Solution14 {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int index = path.indexOf("jdk");
        int index2 = path.indexOf("/",  index+ 6);

        String first = path.substring(0, index);
        String last = path.substring(index2);


        String result = first + jdk + last;
        return result;
    }
}
