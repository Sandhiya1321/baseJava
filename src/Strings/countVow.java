package Strings;

import java.util.Scanner;

public class countVow {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();

        String vow="aeiouAEIOU";
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(vow.indexOf(ch)!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
