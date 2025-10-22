package Arrays;

import java.util.Scanner;

public class symmetricPair {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i][0]==arr[j][1]&&arr[i][1]==arr[j][0]){
                    System.out.println("("+arr[i][0]+","+arr[i][1]+")");
                }
            }
        }
    }
}
