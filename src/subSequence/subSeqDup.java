package subSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSeqDup {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=seqdup(arr);
        for(List<Integer> list:ans) {
            System.out.println(list);
        }
    }
    //when u find a duplicate element only add it in the newly created subset of previous step
    //because of above point duplicates have to be together
    //sort the array to achieve this
    static List<List<Integer>> seqdup(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            //if current and previous element is same,s=end+1
            if(i>0&&arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}