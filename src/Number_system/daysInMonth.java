package Number_system;

import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int month=scan.nextInt();
        int year=scan.nextInt();
        if(((month==2)&&(year%400==0)||((year%4==0)&&(year%100!=0)))){
            System.out.println("29 days");
        }else if(month==2){
            System.out.println("28 days");
        }else if((month%2!=0&&month<2)||(month%2==0&&month>=8)){
            System.out.println("31 days");
        }else{
            System.out.println("30 days");
        }
    }

}
