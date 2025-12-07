package TCS;

import java.util.Scanner;

public class seatingArrang {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        if(n<2){
            System.out.println("invalid");
        }
        int seating=fact(2)*fact(n-1);
        System.out.println(seating);
    }
    static int fact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

}
