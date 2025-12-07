package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class sweetBox {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        int max=0;
        boolean tie=false;
        int winIn=-1;
        for (int i = 0; i < n; i++) {
            //input for number of box
            int box = scan.nextInt();
            //input for sweets
            int[] sweet = new int[box];
            for (int j = 0; j < box; j++) {
                sweet[i] = scan.nextInt();
            }
            Arrays.sort(sweet);
            //find unique
            int uniqueC = 0;
            for (int j = 0; j < box; j++) {
                if (sweet[i] != sweet[i + 1]) {
                    uniqueC++;
                }
            }
            int score = box;
            //bonus points
            if (uniqueC == 4) {
                score += 1;
            } else if (uniqueC == 5) {
                score += 2;
            } else if (uniqueC >= 6) {
                score += 4;
            }
            if (score > max) {
                max = score;
                winIn = i;
            } else if (score == max) {
                tie = true;
            }
        }
        if(tie){
            System.out.println("tie");
        }else if(winIn==0){
            System.out.println("Radha");
        }else{
            System.out.println(winIn+1);
        }
    }
}
