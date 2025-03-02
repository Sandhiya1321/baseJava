public class fibonacci {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n=6;
        int a=1,b=1,c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<=n;i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }

}

