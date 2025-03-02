

import java.util.Scanner;

public class reverse {
    public static int reverse(int num) {
        int reverse=0;
        while(num>0) {
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;

        }
        return reverse;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the num:");
        int num=scan.nextInt();
        System.out.println(reverse(num));

    }

}
