package Strings;

public class capFl {
    public static void main(String[] args) {
        String str="hello world";
        StringBuilder res=new StringBuilder();
        char first='.';
        char last='.';
        String middle="";
        for (int i=0;i< str.length();i++) {
            int n=str.length();
            if(n==1){
                res.append(Character.toUpperCase(str.charAt(0))+"");
            }else{
                 first=Character.toUpperCase(str.charAt(0));
                 last=Character.toUpperCase(str.charAt(n-1));
                 middle=str.substring(1,n-1);

            }
        }
        res.append(first).append(middle).append(last).append(" ");
        System.out.println(res.toString().trim());
    }
}
