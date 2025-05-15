package TCS;

import java.util.Scanner;

public class multiplyInteger {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int prod=1;
        while(n>0){
            int rem=n%10;
            prod=prod*rem;
            n=n/10;
        }
        System.out.println(prod);
    }
}
