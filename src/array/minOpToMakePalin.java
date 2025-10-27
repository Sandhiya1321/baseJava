package array;

public class minOpToMakePalin {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 9, 1} ;
        System.out.println(palin(arr));
    }
    public static int palin(int[] arr){
        int ans=0;
        int n=arr.length;
        for(int i=0,j=n-1;i<=j;){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else if(arr[i]>arr[j]){
                j--;
                arr[j]+=arr[j+1];
                ans++;
            }else{
                i++;
                arr[i]+=arr[i-1];
                ans++;
            }
        }
        return ans;
    }
}
