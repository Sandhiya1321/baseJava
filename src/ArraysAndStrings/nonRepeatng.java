package ArraysAndStrings;

import java.util.Scanner;

public class nonRepeatng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        char result = frstnonreptchar(input);
        if (result != '\0') {
            System.out.println(result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    static char frstnonreptchar(String str) {
        int[] charCounts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCounts[currentChar]++;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (charCounts[currentChar] == 1) {
                return currentChar;
            }
        }

        return '\0';
    }
}