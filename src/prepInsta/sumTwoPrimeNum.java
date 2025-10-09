package prepInsta;

import java.util.Scanner;

public class sumTwoPrimeNum {


    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int x=0;
        for(int i=2;i<num/2;i++){
            if(prime(i)==1){
                if(prime(num-i)==1) {
                    System.out.println(num+ " = "+i+" + "+(num-i));
                    x=1;
                }
            }
            if(x==0) System.out.println("cannot be exp as sum");
        }
    }
    public static int prime(int num){
        int c=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
               c=0;
               break;
            }
        }
        return c;
    }
}
