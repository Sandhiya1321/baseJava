package Number_system;

import java.util.Scanner;

public class abundantNum {
    public static void main(String[] args) {
        //if the sum of factors is greater than the num then it is abundant number
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int sum=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum>num){
            System.out.println("It's an abundant number");
            System.out.println ("The Abundance is: " + (sum - num));
        }else{
            System.out.println("It's not an abundant number");
        }
    }
}
