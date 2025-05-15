package twoD;

import java.util.Scanner;

//LeetCode 54(important question ZOHO)
//yime complexity-O(n*m)
public class spiralMatrix {
    public static void main(String[] args) {
    int[][] arr={{1, 2, 3},
                {4, 5, 6},
             {7, 8, 9} };

//        Scanner scanner = new Scanner(System.in);
//            int rows = scanner.nextInt();
//            int cols = scanner.nextInt();
//
//            int[][] arr = new int[rows][cols];
//            for (int i = 0; i < rows; i++) {
//                for (int j = 0; j < cols; j++) {
//                    arr[i][j] = scanner.nextInt();
//                }
//            }
            int rowStart=0;
        int rowEnd=arr.length;
        int colStart=0;
        int colEnd=arr[0].length;
        while(rowStart<rowEnd&&colStart<colEnd) {
            for (int i = colStart; i<colEnd;i++){
                System.out.print(arr[rowStart][i]+" ");
            }
            rowStart+=1;
            for (int i = rowStart; i <rowEnd; i++) {
                System.out.print(arr[i][colEnd-1]+" ");
            }
            colEnd-=1;
            for(int i=colEnd-1;i>=colStart;i--){
                System.out.print(arr[rowEnd-1][i]+" ");
            }
            rowEnd-=1;
            for(int i=rowEnd-1;i>=rowStart;i--){
                System.out.print(arr[i][colStart]+" ");
            }
            colStart+=1;
        }

    }

}
