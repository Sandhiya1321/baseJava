package twoD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class medianBruteForce {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };
        ArrayList<Integer> lst=new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for(int j=0;j<matrix[0].length;j++){
                lst.add(matrix[i][j]);
            }
        }
        Collections.sort(lst);
        int median=lst.size()/2;
        System.out.println(lst.get(median));

    }
}
