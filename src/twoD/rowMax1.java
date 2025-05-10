package twoD;
//2643
import java.util.ArrayList;

public class rowMax1 {
    public static void main(String[] args) {
       int[][] arr= {{0, 1, 1, 1},
                     {0, 0, 1, 1},
                     {1, 1, 1, 1},
                     {0, 0, 0, 0} };
        System.out.println(max(arr));

    }
    static int max(int[][] arr){
        int index=0;
        int maxCount=0;
        int m=arr.length;
        int n=arr[0].length;

        for (int i = 0; i < m; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                count+=arr[i][j];
            }
            if(count>maxCount){
                maxCount=count;
                index=i;
            }
        }
        return index;
    }
}
