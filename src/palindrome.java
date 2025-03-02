import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome(String str) {
        int left=0;
        int right=str.length()-1;
        while(left<right) {
            if(str.charAt(left)!=str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[]args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the String:"  );
        String a=scan.nextLine();
        if(isPalindrome(a)) {
            System.out.println(a   +"  is palindrome");
        }
        else {
            System.out.println(a  +" is not palindrome");
        }
    }

}

