package prepInsta;

public class countXdigits {
    public static void main(String[] args) {
        int num=74444;
        int x=4;
        int count=0;
        while(num!=0){
            int dig=num%10;
            if(dig==x){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
