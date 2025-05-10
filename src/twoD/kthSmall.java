package twoD;
//378
public class kthSmall {
        public static int kthSmallest(int[][] matrix, int k) {
            int n = matrix.length;
            int low = matrix[0][0], high = matrix[n-1][n-1];

            while (low < high) {
                int mid = low + (high - low) / 2;
                int count = countLessOrEqual(matrix, mid);

                if (count < k) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
        // Counts elements ≤ target in the sorted matrix
        private static int countLessOrEqual(int[][] matrix, int target) {
            int n = matrix.length;
            //check from bottom to left
            int row = n - 1, col = 0, count = 0;

            while (row >= 0 && col < n) {
                if (matrix[row][col] <= target) {
                    count += row + 1;  // Add all elements in current row
                    col++;
                } else {
                    row--;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 5, 9},
                    {10, 11, 13},
                    {12, 13, 15}
            };
            int k = 8;
            System.out.println("K-th smallest element: " + kthSmallest(matrix, k));
        }
}
