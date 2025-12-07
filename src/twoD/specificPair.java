package twoD;

public class specificPair {
    public static void main(String[] args) {
        int n=5;
        int[][] arr = {
                { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 6, 1, 3 },
                { -4, -1, 1, 7, -6 },
                { 0, -4, 10, -5, 1 }
        };
        System.out.println(max(n,arr));
    }
    public static int max(int n,int[][] arr){
        int max=0;
        for (int i = 0; i < n-1; i++) {
            for(int j=0;j<n-1;j++){
                for(int k=i+1;k<n;k++){
                    for (int l = j+1; l < n; l++) {
                        if(max<(arr[k][l]-arr[i][j])){
                            max=arr[k][l]-arr[i][j];
                        }
                    }
                }
            }
        }
        return max;
    }
}
