package TCS;

import java.util.Scanner;

public class maxNoOnes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int col=scan.nextInt();
        int[][] arr=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        int maxCount=0;
        int maxRow=-1;
        for (int i = 0; i < row; i++) {
            int count=0;
            for (int j = 0; j < col; j++) {
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
//                maxRow=i+1;
            }
        }
        System.out.println(maxCount);
    }
}