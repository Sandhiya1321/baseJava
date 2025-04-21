package ArraysAndStrings;

import java.util.Scanner;

public class remvow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println(removeSinOcc(input));
    }

    static String removeSinOcc(String str) {
        String result = "";
        boolean lastWasVowel = false;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (isVowel(currentChar)) {
                if (!lastWasVowel) {
                    lastWasVowel = true;
                } else {
                    result += currentChar;
                }
            } else {
                lastWasVowel = false;
                result += currentChar;
            }
        }

        return result;
    }


    static boolean isVowel(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}