package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class sortByRisk_DutchNationalFlag {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] risk=new int[n];
        for (int i = 0; i < n; i++) {
            risk[i]=scan.nextInt();
        }
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(risk[mid]==0){
                int temp=risk[mid];
                risk[mid]=risk[low];
                risk[low]=temp;
                low++;
                mid++;
            }
            else if(risk[mid]==1){
                mid++;
            }
            else {
                int temp=risk[mid];
                risk[mid]=risk[high];
                risk[high]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(risk));
    }
}
