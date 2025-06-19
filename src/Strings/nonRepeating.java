package Strings;

public class nonRepeating {
    public static void main(String[] args) {
        String str="hello";
        System.out.println(nonRepeat(str));
    }
    static String nonRepeat(String str){
        StringBuilder res= new StringBuilder();
        int[] count=new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            count[ch]++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(count[ch]==1){
                res.append(ch);
            }
        }
        return res.toString();
    }
}
