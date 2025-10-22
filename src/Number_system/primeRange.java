package Number_system;

public class primeRange {
    public static void main(String[] args) {
        int start=1;
        int end=100;
        int count=0;
        for(int i=start;i<end;i++){
            if(prime(i)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
    public static boolean prime(int n){
        if(n<2) return false;
        else{
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}