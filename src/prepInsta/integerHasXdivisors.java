package prepInsta;

import java.util.Scanner;

public class integerHasXdivisors {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int x=scan.nextInt();
        int count=0;

        for(int i=1;i<=num;i++){
            int countf=0;
            for(int j=1;j<=i;j++){
            if(i%j==0){
                countf++;
            }
        }
        if(countf==x){
            count++;
        }
        }
        System.out.println(count);
    }
}
