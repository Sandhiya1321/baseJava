package Strings;

public class replacePartWithAnother {
    //brute force
    public static void remove(String str,String word){
        String[] str1=str.split(" ");
        String newStr="";
        for(String ch:str1){
            if(!ch.equals(word)){
                newStr += ch+" ";
            }
        }
        System.out.println(newStr);
    }
    public static void rplc(String str,String word){
        String stria=str.replaceAll(word,"");
        System.out.println(stria);
    }
    public static void main(String[] args) {
        String str = "This is the prepinsta";
        String word = "the";
        remove(str, word);
        rplc(str,word);
    }
}
