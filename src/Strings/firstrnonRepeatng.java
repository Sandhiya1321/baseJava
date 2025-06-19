package Strings;

import java.util.Scanner;

public class firstrnonRepeatng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char result = frstnonreptchar(input);
        if (result != '.') {
            System.out.println(result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

   static char frstnonreptchar(String str){
        int[] charcount=new int[256];
       for (int i = 0; i < str.length(); i++) {
           char charCurr=str.charAt(i);
           charcount[charCurr]++;
       }
       for (int i = 0; i < str.length(); i++) {
           char currChar=str.charAt(i);
           if(charcount[currChar]==1){
               return currChar;
           }
       }
       return '.';
   }
}
