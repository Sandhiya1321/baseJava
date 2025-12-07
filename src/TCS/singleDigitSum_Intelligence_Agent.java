package TCS;

import java.util.Scanner;

public class singleDigitSum_Intelligence_Agent {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int R=scan.nextInt();
        System.out.println(finalDigit(N,R));
    }
    static int finalDigit(int N,int R) {
        if (R == 0) {
            return 0;
        }
        int initialSum=sumOfDigits(N);
        int repeat=initialSum*R;
        while (repeat >= 10) {
            repeat = sumOfDigits(repeat);
        }

        return repeat;

    }
     static int sumOfDigits(int N){
         int sum=0;
         while(N>0){
             int rem=N%10;
             sum=sum+rem;
             N/=10;
         }
         return sum;
     }
}
