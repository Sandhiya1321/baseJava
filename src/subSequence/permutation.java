package subSequence;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        String str="abcd";
//        repeat("",str);
        System.out.println(repeat1("",str));
        System.out.println(repeatCount("",str));
    }
    static void repeat(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String e=p.substring(i,p.length());
            repeat(f+ch+e,up.substring(1));
        }
    }
    static ArrayList<String> repeat1(String p, String up){
        if(up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String e=p.substring(i,p.length());
           ans.addAll(repeat1(f+ch+e,up.substring(1)));
        }
        return ans;
    }
    static int repeatCount(String p,String up){
        if(up.isEmpty()) {
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String e=p.substring(i,p.length());
            count=count+repeatCount(f+ch+e,up.substring(1));
        }
        return count;
    }
}