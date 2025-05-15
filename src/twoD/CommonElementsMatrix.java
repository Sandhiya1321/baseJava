package twoD;

import java.util.Arrays;

public class CommonElementsMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {2, 3, 5, 7, 9},
                {1, 3, 5, 6, 8}
        };

        findCommonElements(matrix);
    }

    public static void findCommonElements(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxValue = Arrays.stream(matrix).flatMapToInt(Arrays::stream).max().orElse(0);
        int[] frequency = new int[maxValue + 1];

        for (int num : matrix[0]) {
            frequency[num] = 1;
        }

        for (int i = 1; i < rows; i++) {
            for (int num : matrix[i]) {
                if (frequency[num] == i) {
                    frequency[num]++;
                }
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == rows) {
                System.out.print(i + " ");
            }
        }
    }
}