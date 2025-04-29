package ArraysAndStrings;

public class remSpecChar {
    public static void main(String[] args) {
        String input = "P@yt#on123";
        String special = "!@#$%^&*()_+<>,.1234567890";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (special.indexOf(current) == -1) {
                result.append(current);
            }
        }
        System.out.println("Result without special characters: " + result.toString());
    }
}