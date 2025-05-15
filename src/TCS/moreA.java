package TCS;

import java.util.Scanner;

public class moreA {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int n=scan.nextInt();

        int max=0;
        for (int i = 0; i < str.length(); i+=n) {
            int count=0;
            for (int j = 1; j <Math.min(i+n,str.length()) ; j++) {
                if(str.charAt(j)=='a'){
                    count++;
                }
            }
            max=Math.max(max,count);

        }
        System.out.println(max);
    }
}
