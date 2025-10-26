public class mulUsingSum {
    public static void main(String[] args) {
        /* write function to find mul of 2 num using + operator you must use min pos iterations */
        int x=4;
        int y=8;
        int ans=0;
        for (int i = 1; i < x; i++) {
            ans=ans+y;
        }
        System.out.println(ans);
    }
}
