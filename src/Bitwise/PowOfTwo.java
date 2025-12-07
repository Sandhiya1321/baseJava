package Bitwise;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 10;
        boolean ans = (n > 0) && (n & (n - 1)) == 0;

        System.out.println(ans);
    }
}