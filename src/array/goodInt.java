package array;

import java.util.ArrayList;
import java.util.List;

public class goodInt {
    public static void main(String[] args) {
        int[] arr={1, 6, 4, 5};
        System.out.println(good(arr));
    }
    public static boolean good(int x){
        return (x&(x-1))!=0;
    }
    public static List<Integer> good(int[] arr){
        List<Integer> ans=new ArrayList<>();
        for(int a:arr){
            if(good(a)){
                ans.add(a);
            }
        }
        return ans;
    }
}
