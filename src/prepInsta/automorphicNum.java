package prepInsta;

import java.util.Scanner;

public class automorphicNum {
//square the num and check whether the last digit of the squared number and the num is same
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        int ans=num*num;
            int digit=ans%10;
            if(digit==num){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
    }
}
