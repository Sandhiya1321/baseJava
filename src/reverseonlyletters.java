
import java.util.Scanner;
public class reverseonlyletters {



    public static String reverse(String str){
        char ch[]=str.toCharArray();
        int low=0;
        int high=ch.length-1;
        while(low<=high){
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
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.next();
        System.out.print(reverse(str));
    }
}

