import java.util.Arrays;
import java.util.Scanner;

public class arrayString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] str=new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i]=scan.next();
        }
        System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
        System.out.println();

        for(String a:str)
            System.out.println(Arrays.toString(str));

    }
}
