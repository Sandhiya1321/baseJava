package Strings;

import java.util.Scanner;
public class reverseonlyletters {
    public static String reverse(String str){
        char[] chars = str.toCharArray();
        int start = 0;

        for (int end = 0; end <= chars.length; end++) {
            // Check for end of word or end of string
            if (end == chars.length || chars[end] == ' ') {
                reverseWord(chars, start, end - 1);
                start = end + 1; // Move start to the next word
            }
        }
        return new String(chars);
    }
    static void reverseWord(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.nextLine();
        System.out.print(reverse(str));
    }
}

