package array;

public class longPalindrome {
    public static boolean palindrome(int n){
        String s=String.valueOf(n);
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) {
                return false;
            }
                left++;
                right--;
        }
        return true;
    }
    public static int longpal(int[] arr) {
        int longest = -1;
        for (int n : arr) {
            if (palindrome(n)) {
                if (String.valueOf(n).length()>String.valueOf(longest).length()){
                    longest=n;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr={123,34,255,357,545,76567};
        System.out.println(longpal(arr));
    }
}
