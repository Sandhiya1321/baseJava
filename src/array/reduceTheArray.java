package array;

import java.util.*;

public class reduceTheArray {
    //add arr[i] and arr[j]
    //add it in an array with remaining values
    //then delete arr[i] and arr[j]
    //add the sum to the min or max value
    // repeat these steps until the array length becomes 1

    public static int reduce(int[] arr){
        Arrays.sort(arr);
        int max=0;
        List<Integer> ans=new ArrayList<>();
        for (int a:arr) ans.add(a);
        while(ans.size()>1){
            int a=ans.get(0);
            int b=ans.get(1);
            int sum=a+b;
            max+=sum;
            List<Integer> list=new ArrayList<>();
            list.add(sum);


            for(int i=2;i<ans.size();i++){
                list.add(ans.get(i));
                Collections.sort(list);
            }
            ans=list;
        }


        return max;
    }
    //using priority queue
    //huffman algorithm-merging but also maintaining the sum
    public static int reduceQueue(int[] arr){
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        int min=0;
        for(int n:arr) queue.offer(n);
        while(queue.size()>1){
            int a=queue.poll();
            int b=queue.poll();
            int sum=a+b;
            //add new sum to heap
            queue.offer(sum);
            //adding the running result
            min+=sum;
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={45,10,25,30,80,65};
        System.out.println(reduce(arr));
        System.out.println(reduceQueue(arr));
    }
}
