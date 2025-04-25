package ArraysAndStrings;

public class removeBrackets {
    public static void main(String[] args) {
        String input = "(x+y)*(a+b)";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '(' && input.charAt(i) != ')') {
                output.append(input.charAt(i));
            }
        }

        System.out.println( output.toString());
    }
}
