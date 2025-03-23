package sortingAndSearching;

import java.util.Arrays;
public class merge {
    public static int[] merge(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]=merge(Arrays.copyOfRange(arr,0,mid));
        int right[]=merge(Arrays.copyOfRange(arr,mid,arr.length));

        return sort(left,right);
    }
    public static int[] sort(int left[],int right[]){
        int res[]=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                res[k]=left[i];
                i++;
                k++;
            }
            else{
                res[k]=right[j];
                j++;
                k++;
            }

        }
        while(i<left.length){
            res[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            res[k]=right[j];
            j++;
            k++;
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr={12,56,44,245,678,876};
        System.out.println(Arrays.toString(merge(arr)));
    }
}

