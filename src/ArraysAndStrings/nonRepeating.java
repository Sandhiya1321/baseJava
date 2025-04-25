package ArraysAndStrings;

import java.util.HashMap;

public class nonRepeating{
    public static void main(String[] args) {
        String input = "hello";
        findNonRepeatingCharacters(input);
    }

    public static void findNonRepeatingCharacters(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.print("Non-repeating characters: ");

        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                System.out.print(c + " ");
            }
        }
    }
}
