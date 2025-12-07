package Strings;

import java.util.Scanner;

public class checkAlpha {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        //built in
        if(Character.isAlphabetic(ch)){
            System.out.println("Alphabet");
        }else{
            System.out.println("Not Alphabet");
        }
        //normal
        if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
            System.out.println("Alphabet");
        }else{
            System.out.println("Not Alphabet");
        }
    }
}
