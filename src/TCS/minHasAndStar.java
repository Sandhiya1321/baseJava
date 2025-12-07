package TCS;

import java.util.Scanner;

public class minHasAndStar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int countHas=0;
        int countStar=0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='*'){
                countStar++;
            }
            else if(str.charAt(i)=='#'){
                countHas++;
            }
        }
        if(countStar==countHas){
            System.out.println("0");
        }
        else if(countStar>countHas){
            System.out.println("1");
        }
        else {
            System.out.println("-1");
        }

    }
}
