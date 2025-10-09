package prepInsta;

import java.util.Scanner;

public class friendlyPair {
    public static void main(String[] args) {
        //if sum of the factors is divisible by the num and both are equal then it is friendly pair
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();

        int ans1=help(num1);
        int ans2=help(num2);

        if(ans1/num1==ans2/num2){
            System.out.println("friend");
        }else{
            System.out.println("not");
        }

    }
    public static int help(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
