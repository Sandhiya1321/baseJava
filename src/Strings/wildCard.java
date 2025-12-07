package Strings;

public class wildCard {
    public static void main(String[] args) {
        String str="prepinsta";
        String str1="pre?sta";
        System.out.println(wild(str,str1));
    }
    public static boolean wild(String str1,String str2){
        char[] ch=str1.toCharArray();
        char[] ch1=str2.toCharArray();
        for (char c : ch) {
            for (char value : ch1) {
                if (ch.length == ch1.length) {
                    if (c == value || c == '?' || value == '?') {
                        return true;
                    }
                }
                if (c == '*' || value == '*') {
                    return true;
                }
            }
        }
        return false;
    }
}
