package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class moveZeros_ChocolateFactory {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        int nonZero=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[nonZero];
                arr[nonZero]=temp;
                nonZero++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
