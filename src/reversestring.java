public class reversestring {
    public static String reverse(String str){
        char ch[]=str.toCharArray();
        int low=0;
        int high=str.length()-1;
        while(low<high){
            if(Character.isAlphabetic(ch[low])&&Character.isAlphabetic(ch[high])){
                char temp=ch[low];
                ch[low]=ch[high];
                ch[high]=temp;
                low++;
                high--;
            }
            else if(!Character.isAlphabetic(ch[low]))
                low++;
            else if(!Character.isAlphabetic(ch[high]))
                high--;
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String str="abc ugh+ hgv";
        String res=reverse(str.toString());
        System.out.println(res);
    }

}
