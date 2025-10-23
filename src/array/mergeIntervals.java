package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {
    public static int[][] merge(int[][] intervals) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n=intervals.length;
        for (int[] interval : intervals) {
            int left = interval[0];
            int end = interval[1];
            if (list.isEmpty() || left > list.getLast().get(1)) {
                list.add(Arrays.asList(left, end));
            } else {
                List<Integer> ans = list.getLast();
                ans.set(1, Math.max(ans.get(1), end));
            }
        }
        int[][]  res=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i][0]=list.get(i).get(0);
            res[i][1]=list.get(i).get(1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }
}
