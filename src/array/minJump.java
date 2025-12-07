package array;

public class minJump {

    public static int jump(int[] arr){
        int n=arr.length;
        if(n<=1) return 0;
        if(arr[0]==0) return -1;
        int max=arr[0];
        int jump=1;
        int steps=arr[0];
        for (int i = 1; i < n; i++) {
            //reaches end
            if(i==n-1) return jump;
            max=Math.max(max,i+arr[i]);
            steps--;
            if(steps==0){
                jump++;
                if(i>max) return -1;
                steps=max-i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 3, 4, 5, 1, 2, 8};
        System.out.println(jump(arr));
    }
}
