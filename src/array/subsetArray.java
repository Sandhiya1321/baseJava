package array;

import java.util.HashSet;

public class subsetArray {
    public static boolean sub(int[] arr1,int[] arr2){
        HashSet<Integer> has=new HashSet<>();
        for(int num:arr1){
            has.add(num);
        }
        for(int num:arr2){
            if(!has.contains(num)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 11, 10, 13, 21, 30, 70 };
        int[] arr2 = { 11, 30, 70, 10 };
        System.out.println(sub(arr1,arr2));
    }
}
