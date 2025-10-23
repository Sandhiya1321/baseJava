package array;

import java.util.Arrays;

public class minMaxDifHght {
    public static int minDif(int[] arr,int n,int k){
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int shortest=arr[0]+k;
        int longest=arr[n-1]-k;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0) continue;
            int min=Math.min(shortest,arr[i]-k);
            int max=Math.max(longest,arr[i-1]+k);
            ans=Math.min(ans,max-min);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        int ans = minDif(arr, arr.length, k);
        System.out.println(ans);
    }
}
