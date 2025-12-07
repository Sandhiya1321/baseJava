package array;

import java.util.Arrays;

public class sortWoAlgm {
    public static void main(String[] args) {
        int[] arr={0, 2, 1, 2, 0};
        int count0=0;
        int count1=0;
        int count2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count0++;
            }else if(arr[i]==1){
                count1++;
            }else{
                count2++;
            }
        }
        int index=0;
        while(count0>0){
            arr[index++]=0;
            count0--;
        }while(count1>0){
            arr[index++]=1;
            count1--;
        }while(count2>0){
            arr[index++]=2;
            count2--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
