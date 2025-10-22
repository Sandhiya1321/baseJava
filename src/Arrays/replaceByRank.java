package Arrays;

import java.util.Arrays;

public class replaceByRank {
    public static void main(String[] args) {
        int[] arr = { 100, 2, 70, 12 , 90};
        System.out.println(Arrays.toString(replace(arr)));
    }
    public static int[] replace(int[] arr){
        int[] copied= Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(copied);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<copied.length;j++){
                if(arr[i]==copied[j]){
                    arr[i]=j+1;
                    break;
                }
            }
        }
        return arr;
    }
}
