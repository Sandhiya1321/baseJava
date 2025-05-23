package Arrays;

public class feqChar {
    public static void main(String[] args) {
        String str = "hello";
        int[] frequency = new int[256];

        for (char c : str.toCharArray()) {
            frequency[c]++;
        }
        for (char c : str.toCharArray()) {
            if (frequency[c] > 0) {
                System.out.print(c + ":" + frequency[c] + " ");
                frequency[c] = 0;
            }
        }
    }
}
