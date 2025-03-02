public class primenumb {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int begin=10;
        int end=20;
        int next;
        for(int i=begin;i<=end;i++){
            int isPrime=1;

            for(int j=2;j<=i/2;j++) {
                if(i%j==0) {
                    System.out.println(i+"  is not a prime");
                    isPrime=0;
                    break;
                }
            }
            if(isPrime==1) {
                System.out.println(i+ "  a prime");
            }


        }}}



