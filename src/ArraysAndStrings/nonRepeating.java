package ArraysAndStrings;

public class NonRepeating {
    public static void main(String[] args) {
        String input = "sandhiya";
        System.out.print("Non-repeating characters: ");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (input.indexOf(c) == input.lastIndexOf(c)) {
                System.out.print(c + " ");
            }
        }
    }
}