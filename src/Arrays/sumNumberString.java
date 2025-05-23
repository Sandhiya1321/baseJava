package Arrays;

public class sumNumberString {
    public static void main(String[] args) {
        int sum = 0;
        String in = "abc123def456";

        for (int i = 0; i < in.length(); i++) {
            if (Character.isDigit(in.charAt(i))) {
                int start = i;
                while (i < in.length() && Character.isDigit(in.charAt(i))) {
                    i++;
                }
                sum = sum + Integer.parseInt(in.substring(start, i));
            }
        }
        System.out.println(sum);
    }
}