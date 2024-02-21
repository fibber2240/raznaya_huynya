package javaRush.metod;

public class Solution3 {
    public static void main(String[] args) {
        System.out.println(ninthDegree(2));
    }

    public static long cube(long a){
        return a*a*a;
    }

    public static long ninthDegree(long l){
        return cube(cube(l));
    }
}
