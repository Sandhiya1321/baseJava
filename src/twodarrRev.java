import java.util.Arrays;
import java.util.Scanner;
public class twodarrRev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("enter the array");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j] = scan.nextInt();
            }
        }
        int cols=a[0].length;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("reversed array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length/2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][cols - 1 - j];
                a[i][cols - 1 - j] = temp;
            }
        }
        for( int[] arr : a){
            System.out.println(Arrays.toString(arr));
        }
    }
}