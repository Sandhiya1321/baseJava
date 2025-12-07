package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class oddBalloon {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        char[] str=new char[n];
        for (int i = 0; i < n; i++) {
            str[i]=scan.next().charAt(0);
        }
        Arrays.sort(str);
        boolean foundOdd=false;
        for(int i= 0;i<n;){
            char current=str[i];
            int count = 0;
            while (i < n && str[i] == current) {
                count++;
                i++;
            }
            if(count%2!=0){
                System.out.println(current);
                foundOdd=true;
                break;
            }
        }
        if(!foundOdd){
            System.out.println("All are even");
        }

    }
}
