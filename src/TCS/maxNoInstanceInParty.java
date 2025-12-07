package TCS;

import java.util.Scanner;

public class maxNoInstanceInParty {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int[] E=new int[t];
        int[] L=new int[t];
        for (int i = 0; i < t; i++) {
            E[i]=scan.nextInt();
        }
        for(int i=0;i<t;i++){
            L[i]=scan.nextInt();
        }
        int curGuest=0;
        int max=0;
        for(int i=0;i<t;i++){
            curGuest=curGuest+E[i]-L[i];
            max=Math.max(max,curGuest);
        }
        System.out.println(max);
    }
}
