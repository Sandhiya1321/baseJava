package TCS;

import java.util.Scanner;

public class maximumSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(maxii(arr, n));
    }

    public static int maxii(int[] arr, int n) {
        int sum=0;
        int i=0;
        while(i<n){
            int max=arr[i];
            int j=i;
            while(j<n&&(arr[j]>0)==(arr[i]>0)){
                max=Math.max(max,arr[i]);
                j++;
            }
            sum+=max;
            i=j;
        }
        return sum;
    }
}