package Strings;

public class longpalindrome {
    public static void main(String[] args) {
        String[] arr={"abc","car","madam","racecar","apple"};
        System.out.println(findlarge(arr));
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String findlarge(String[] arr){
        if(arr.length==0){
            return "";

        }
        String largepalin="";
        for(String str:arr){
            if(isPalindrome(str)&&str.length()>largepalin.length()){
                largepalin=str;
            }
        }
        return largepalin;
    }
}
