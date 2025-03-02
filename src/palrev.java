public class palrev {
    public static int reverseNum(int n) {
        int reverse=0;
        while(n>0) {
            int digit=n%10;
            reverse=(reverse*10)+digit;
            n=n/10;
        }
        return reverse;

    }
    public static void main(String[]args) {
        int a=5005;
        int rev=reverseNum(a);
        System.out.println("the reverse string:"+a);
        if(a==rev) {
            System.out.println(a+"  is a palindrome");
        }
        else {
            System.out.println(a+"  is not a palindrome");
        }
    }

}
