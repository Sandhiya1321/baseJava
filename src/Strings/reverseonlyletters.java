package Strings;

import java.util.Scanner;
public class reverseonlyletters {
    public static String reverse(String str){
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.nextLine();
        System.out.print(reverse(str));
    }
}

