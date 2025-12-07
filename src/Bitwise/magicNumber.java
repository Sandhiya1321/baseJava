package Bitwise;

import java.util.Scanner;
//amazon
public class magicNumber {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();

        int ans=0;
        int power=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*power;
            power*=5;
        }
        System.out.print(ans);
    }

}
