

import java.util.Arrays;

public class duplicate {
    public static void main(String[]args){

        int arr[]={1,2,3,0};
        Arrays.sort(arr);  //0 1 2 3
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int dup=0;
            if(arr[i]==arr[i+1]){
                dup=1;
            }
            if(dup==1){
                continue;
            }
            System.out.println("duplicate");

        }

    }}
