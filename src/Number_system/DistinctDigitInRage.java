package Number_system;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctDigitInRage {
    public static void main(String[] args) {
        int x=80;
        int y=120;
        System.out.println(distinctCount(x,y));
        System.out.println(distinctValues(x,y));
        System.out.println(distinctCount2(x,y));
    }
//used to verify there is no repeating values in between range
    //output =27

    public static int distinctCount(int x,int y){
        int count=0;
        for(int i=x;i<=y;i++){
            if(distinct(i)){
                count++;
            }
        }
        return count;
    }
    public static List<Integer> distinctValues(int x, int y){
        List<Integer> ans=new ArrayList<>();
        for(int i=x;i<=y;i++){
            if(distinct(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean distinct(int x){
        int sum=0;
        while(x>0){
            int rem=x%10;
            if(sum==rem) return false;
            //this line is used to even verify in an integer there is no repeating value
            //sum=rem;
            x/=10;
        }
        return true;
    }



//another method
    public static boolean distinct2(int n){
        Set<Integer> set=new HashSet<>();
        String s=String.valueOf(n);
        for(char c:s.toCharArray()){
            int digit=Character.getNumericValue(c);
            if(!set.add(digit)){
                return false;
            }
        }
        return true;
    }
    public static int distinctCount2(int m,int n){
        int count=0;
        for(int i=m;i<=n;i++){
            if(distinct2(i)){
                count++;
            }
        }
        return count;
    }
}

