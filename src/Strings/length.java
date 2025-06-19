package Strings;

import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();

        int count=0;
        for(int i:str.toCharArray()){
            count++;
        }
        System.out.println(count);
    }

}
