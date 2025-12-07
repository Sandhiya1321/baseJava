package TCS;

import java.util.Scanner;

public class jeremysFamily {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }
        System.out.println(max(n,k,arr));
    }
    static int max(int n,int k,int[] arr){
        int[] arr1=new int [n+1];
        for(int i=1;i<=n;i++){
             arr1[i]=arr1[i-1]+arr[i-1];
        }

        //first period
        int max=Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int sum=arr1[j]-arr1[i-1];
                //second period
                for (int l = j+k+1; l <=n ; l++) {
                    for (int m = l; m <=n; m++) {
                        int sum1=arr1[m]-arr1[l-1];
                        max=Math.max(max,sum+sum1);
                    }
                }
            }
        }
        return max;
    }
}
