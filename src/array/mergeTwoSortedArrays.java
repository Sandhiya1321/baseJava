package array;


import java.util.ArrayList;
import java.util.List;

public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 12, 9, 3, 17, 20};
        int[] arr2 = new int[]{2, 3, 8, 13};
        System.out.println(merge(arr1,arr2));
    }
    public static List<Integer> merge(int[] nums1,  int[] nums2) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                list.add(nums1[i]);
                i++;
            }else{
                list.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length) list.add(nums1[i++]);
        while(j<nums2.length) list.add(nums2[j++]);
        return list;
    }
}
