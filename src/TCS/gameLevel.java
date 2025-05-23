package TCS;

import java.util.Scanner;

public class gameLevel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        System.out.println(alice(nums));
    }
    static int alice(int[] nums){
        int lastLevel=0;
        int rewards=0;
        for(int num:nums){
            if(num>lastLevel){
                rewards++;
                lastLevel=num;
            }
        }
        return rewards;
    }
}