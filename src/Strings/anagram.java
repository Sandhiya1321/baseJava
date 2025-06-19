package Strings;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str="listen";
        String str1="silent";
        System.out.println(ana(str,str1));

    }
    static String ana(String str,String str1){
        if(str.length()!=str1.length()){
            return "Not Anagram";
        }
        char[] arr=str.toCharArray();
        char[] arr1=str1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(Arrays.equals(arr,arr1)){
            return "Anagram";
        }
        return "Not Anagram";
    }
}
