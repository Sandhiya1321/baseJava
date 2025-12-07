package Searching;

public class evenDigits {
    public static void main(String[] args) {
        int[] nums={12,34,56,765,96,898};
        System.out.println(find(nums));
    }
    static int digit(int nums){
        //return (int)(Math.log10(num));
        if(nums<0){
            nums=nums*-1;
        }
        if(nums==0){
            return 1;
        }
        int count=0;
        while(nums>0){
            count++;
            nums=nums/10;
        }
        return count;
    }
    static boolean even(int count){
        int num=digit(count);
//        if(num%2==0){
//            return true;
//        }
        return num%2==0;
//        return false;
    }
    static int find(int[] nums){
        int sum=0;
        for(int num:nums){
            if(even(num)){
                sum++;
            }
        }
        return sum;
    }
}
