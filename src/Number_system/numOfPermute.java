package Number_system;

import java.util.Scanner;

public class numOfPermute {
    //Permutations in which n people can occupy r seats in a classroom
    //nPr=n!/(n-r)!
    public static void main(String[] args) {
        int n,r,factn,factnr;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        r=scan.nextInt();
        factn=1;
        for(int i=n;i>1;i--){
            factn*=i;
        }
        int num=n-r;
        factnr=1;
        for(int i=num;i>1;i--){
            factnr*=i;
        }

        int ans=factn/factnr;
        System.out.println(ans);
    }


}
