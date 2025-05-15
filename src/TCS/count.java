package TCS;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int result=arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]>result){
                count++;
            }
        }
        System.out.println(count);
    }
}
