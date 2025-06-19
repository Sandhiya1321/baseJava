package Strings;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        StringBuilder toggle=new StringBuilder();
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if((ch>='A'&&ch<='Z')){
                toggle.append((char)(ch+32));//convert to lower
            }else if(ch>='a'&&ch<='z'){
                toggle.append((char)(ch-32));
            }else{
                toggle.append(ch);
            }
        }
        System.out.println(toggle);
    }
}
