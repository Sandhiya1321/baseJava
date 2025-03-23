public class sumDigit{
    public static String digitSum(String s, int k) {
    while (s.length() > k) {
        String newString = "";
        for (int i = 0; i < s.length(); i += k) {
            String group = s.substring(i, Math.min(i + k, s.length()));
            int sum = 0;
            for (char c : group.toCharArray()) {
                sum += c - '0';
            }
            newString += sum;
        }
        s = newString;
    }
    return s;
}

public static void main(String[] args) {
    String s = "11111222223";
    int k = 3;
    System.out.println(digitSum(s, k));
}}