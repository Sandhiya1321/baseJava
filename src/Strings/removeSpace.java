package Strings;

import java.util.Scanner;

public class removeSpace {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        StringBuilder res=new StringBuilder();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                res.append(ch);
            }
        }
        System.out.println(res);
    }
}
