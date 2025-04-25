package ArraysAndStrings;

import java.util.Arrays;

public class permutation {
    public static void main(String[] args) {
        String input = "abc";
        Permutations(input);
    }

    public static void Permutations(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(String.valueOf(chars));

        while (true) {
            int i = chars.length - 2;
            while (i >= 0 && chars[i] >= chars[i + 1]) {
                i--;
            }
            if (i < 0) {
                break;
            }
            int j = chars.length - 1;
            while (chars[j] <= chars[i]) {
                j--;
            }
            swap(chars, i, j);
            reverse(chars, i + 1);
            System.out.println(String.valueOf(chars));
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void reverse(char[] chars, int start) {
        int end = chars.length - 1;
        while (start < end) {
            swap(chars, start, end);
            start++;
            end--;
        }
    }
}
