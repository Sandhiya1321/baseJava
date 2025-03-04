import java.util.Arrays;
import java.util.Scanner;

public class arraytwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(Arrays.toString(arr[i]));
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int[] j : arr) {
                System.out.print(Arrays.toString(arr[i]));
            }
            System.out.println();

        }
    }
}
