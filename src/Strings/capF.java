package Strings;

public class capF {
    public static void main(String[] args) {
        String str="java programming";
        StringBuilder res=new StringBuilder();
        String[] strr=str.split(" ");
        for (String word:strr) {
            if(!str.isEmpty()){
                res.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }
        System.out.println(res.toString().trim());
    }
}
