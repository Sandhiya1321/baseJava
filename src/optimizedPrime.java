public class optimizedPrime {
    //sieve of eratosthenes
    //O(n) space complexity-auxillary space
    //O(N*log(log N)) time complexity
    public static void main(String[] args) {
        int n=49;
        boolean[] prime=new boolean[n+1];
        sieve(n,prime);
    }
    //initially all values in boolean array is false
    //false in array number is prime
    static void sieve(int n,boolean[] prime){
        for (int i = 2; i *i<=n ; i++) {
            if(!prime[i]){
                for (int j = i*2; j <=n; j+=i) {
                    prime[j]=true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(!prime[i]){
                System.out.println(i);
            }
        }
    }
}
