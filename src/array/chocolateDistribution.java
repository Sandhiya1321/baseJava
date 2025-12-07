package array;

import java.util.Arrays;

public class chocolateDistribution {
    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int choco=7;
        int stud=arr.length;
        System.out.println(minimum(arr,choco,stud));
    }
    public static int minimum(int[] arr,int choco,int stud){
        if(choco==0||stud==0) return 0;
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        if(choco > stud) return -1;
        for(int i=0;i+choco-1<stud;i++){
            int dif=arr[i+choco-1]-arr[i];
            if(dif<min) min=dif;
        }
        return min;
    }
}
