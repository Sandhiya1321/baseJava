public class swapvow {
    public static void main(String[] args) {
        String a="Hello World";
        char[] ch=a.toCharArray();
        int left=0;
        int right=a.length()-1;
        String vow="aeiou,AEIOU";
        if(left<right){
            while(vow.indexOf(ch[left])==-1){
                left++;
            }
            while(vow.indexOf(ch[right])==-1){
                right--;
            }
            if(left<right){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }

        }
        String res=new String(ch);
        System.out.println("original String:"+ a);
        System.out.println("swapped String:"+res);
    }
}
