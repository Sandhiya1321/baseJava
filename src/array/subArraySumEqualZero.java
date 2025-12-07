package array;

import java.util.ArrayList;
import java.util.List;

public class subArraySumEqualZero {
    public static boolean Zero(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==0){
                    return true;
                }
            }
        }
        return false;
    }
    public static List<Integer> Zeroo(int[] arr){
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==0){
                    list.add(arr[i]);
                    list.add(arr[j]);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { -3, 3, 1, 6,-1 };
        System.out.println(Zero(arr));
        System.out.println(Zeroo(arr));
    }
}
