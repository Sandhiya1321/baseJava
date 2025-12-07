public class sqrtopt {
    //time complexity-O(log(n))
    public static void main(String[] args) {
        int n=40;
        int decimal=3;
        System.out.printf("%.3f",binarySearchsqrt(n,decimal));
    }
    static double binarySearchsqrt(int n,int decimal){
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m==n){
                return m;
            }
            if(m*m>n){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        double in=0.1;
        for (int i = 0; i < decimal; i++) {
            while(root*root<=n){
                root+=in;
            }
            root-=in;
            in/=10;
        }
        return root;
    }
}
