package internTasks;

import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=scan.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str +" is a Strings.palindrome");
        }
        else{
            System.out.println(str+ " is not a Strings.palindrome");
        }
    }
    static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        for (int i = start; i <=end; i++) {
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
