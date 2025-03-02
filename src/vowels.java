import java.util.Arrays;
public class vowels {
    public static void main(String[] args) {
        String a = "Black Angel";
        int vow = 0;
        int cons = 0;
        int whiteSpace=0;

        for (int i = 0; i < a.length(); i++) {
            char ch = Character.toLowerCase(a.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow++;
            } else if (Character.isAlphabetic(ch)) {
                cons++;
            }
            else{
                whiteSpace++;
            }
        }

        System.out.println("Number of vowels = " + vow);
        System.out.println("Number of consonants = " + cons);
        System.out.println("Number of whiteSpace = "+whiteSpace);
    }
}
