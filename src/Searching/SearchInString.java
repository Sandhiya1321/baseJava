package Searching;

public class SearchInString {
    public static void main(String[] args) {
        String str="Sandhiya";
        char ch ='a';
        System.out.println(search(str,ch));

    }
    static boolean search1(String str,char target){
        if(str==null){
            return false;
        }
        if(str.isEmpty()){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str,char target){
        if(str==null){
            return false;
        }
        if(str.isEmpty()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
