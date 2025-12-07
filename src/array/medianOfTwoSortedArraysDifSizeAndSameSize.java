package array;

public class medianOfTwoSortedArraysDifSizeAndSameSize {
    public static void main(String[] args) {
        int[] arr1 = { 900 };
        int[] arr2 = { 5, 8, 10, 20 };
        System.out.println(median(arr1,arr2));
    }
    public static double median(int[] arr1,int[] arr2){
        if(arr1.length>arr2.length) return median(arr2,arr1);
        int m=arr1.length;
        int n=arr2.length;
        int low=0;
        int high=m;
        while(low<=high){
            int i=(low+high)/2;
            int j=(m+n+1)/2-i;
            int max1=(i==0)?Integer.MIN_VALUE:arr1[i-1];
            int min1=(i==m)?Integer.MAX_VALUE:arr1[i];
            int max2=(j==0)?Integer.MIN_VALUE:arr2[j-1];
            int min2=(j==n)?Integer.MAX_VALUE:arr2[j];

            if(max1<=min2 && max2 <=min1){
                if((m+n)%2==0){
                    return (Math.max(max1,max2)+Math.min(min1,min2))/2.0;
                }else{
                    return Math.max(max1,max2);
                }
            }else if(max1>max2){
                high=i-1;
            }else{
                low=i+1;
            }
        }
        return 0.0;
    }
}
