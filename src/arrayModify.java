import java.util.Arrays;
import java.util.Scanner;

public class arrayModify {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
         arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        arr[1]=56;
        System.out.println(Arrays.toString(arr));
    }
}
