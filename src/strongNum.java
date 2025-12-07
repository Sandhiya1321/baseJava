public class strongNum {
    public static void main(String[] args) {
        //split the num and find the factorial then add if the num and sum is equal then it is strong num
        int num=123;
        int temp=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=fact(digit);
            num/=10;
        }
        if(sum==temp){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static int fact(int num){
        int ans=1;
        for(int i=2;i<num;i++){
            ans*=i;
        }
        return ans;
    }
}
