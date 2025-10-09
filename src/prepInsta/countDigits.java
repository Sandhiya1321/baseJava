package prepInsta;

public class countDigits {
    public static void main(String[] args) {
        int num=876540976;

        int count=0;
        while(num!=0){
            int digit=num%10;
            count++;
            num/=10;
        }
        System.out.println(count);
    }
}
