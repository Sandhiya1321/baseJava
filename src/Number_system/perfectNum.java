package Number_system;

public class perfectNum {
    public static void main(String[] args) {
        int num=6;
        int ans=1;
        //if the sum of factors of the number are equal to num
        for(int i=2;i<num;i++){
            if(num%i==0){
                ans+=i;
            }
        }
        System.out.println(ans==num);
    }
}
