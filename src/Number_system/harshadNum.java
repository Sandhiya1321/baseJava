package Number_system;

import java.util.Scanner;

public class harshadNum {
    public static void main(String[] args) {

        //split the num into digits and sum them and divide it if it is equal to 0 then its harshad number
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int temp=num;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        if(temp%sum==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
