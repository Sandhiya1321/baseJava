package Strings;

import java.util.Scanner;

public class vowConst {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);

        String vow="aeiouAEIOU";
            if (vow.indexOf(ch)!=-1){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
    }
}
