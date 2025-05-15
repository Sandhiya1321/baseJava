package TCS;

import java.util.Scanner;

public class fine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        int D=scan.nextInt();
        int x=scan.nextInt();

       boolean dateEven=(D%2==0);
       int fine=0;
       for(int digit:arr){
           boolean dateEvent=(digit%2==0);
           if(dateEvent!=dateEven){
               fine+=x;
           }
       }
        System.out.println(fine);
    }
}
