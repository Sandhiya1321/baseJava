package array;

import java.util.Arrays;

public class scalarProd {
    public static void main(String[] args) {
        int[] arr1={1, 2, 6, 3, 7};
        int[] arr2={10, 7, 45, 3, 7};
        System.out.println(minScalar(arr1,arr2));
        System.out.println(maxScalar(arr1,arr2));
    }
    public static int minScalar(int[] arr1,int[] arr2){
        Arrays.sort(arr1);

        for(int i=0;i<arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i]<arr2[j]){
                    int temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        int prod=0;
        for (int i = 0; i < arr1.length; i++) {
            prod+=arr1[i]*arr2[i];
        }
        return prod;
    }
    public static int maxScalar(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int prod=0;
        for (int i = 0; i < arr1.length; i++) {
            prod+=arr1[i]*arr2[i];
        }
        return prod;
    }
}
