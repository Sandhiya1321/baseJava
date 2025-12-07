package Bitwise;

import java.util.Scanner;

public class oddEven {
//    public static void main(String[] args) {
//        Scanner scan =new Scanner(System.in);
//        int n=scan.nextInt();
//        if((n&1)==1){
//            System.out.println("odd");
//        }
//        else{
//            System.out.println("even");
//        }
//    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(oddEve(n));
    }

    static boolean oddEve(int n) {
        return (n & 1) == 1;
    }
}