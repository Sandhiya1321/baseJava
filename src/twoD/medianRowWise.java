package twoD;
public class medianRowWise {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };
        System.out.println(findMedian(matrix));
    }

    static int findMedian(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int min = matrix[0][0], max = matrix[0][c - 1];
        for (int i = 1; i < r; i++) {
            min = Math.min(min, matrix[i][0]);
            max = Math.max(max, matrix[i][c - 1]);
        }

        int desired = (r * c + 1) / 2;

        while (min < max) {
            int mid = min + (max - min) / 2;
            int count = 0;
            for (int i = 0; i < r; i++) {
                count += countSmaller(matrix[i], mid);
            }

            if (count < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

    static int countSmaller(int[] row, int mid) {
        int low = 0, high = row.length;
        while (low < high) {
            int m = low + (high - low) / 2;
            if (row[m] <= mid) {
                low = m + 1;
            } else {
                high = m;
            }
        }
        return low;
    }
}