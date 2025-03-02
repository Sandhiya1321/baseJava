import java.util.Scanner;

public class arraydel {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size");
        int n=scan.nextInt();
        int array[] =new int[n];
        int res[]=new int[n];

        for(int i=0;i<n;i++) {
            array[i]=scan.nextInt();
        }

        for(int i=0;i<n;i++) {
            System.out.println(array[i]);
        }

        //delete

        for(int i=0;i<n-1;i++) {
            if(i>=2) {
                res[i]=array[i+1];

            }
            else {
                res[i]=array[i];
            }

        }
        System.out.println("after deletion");
        for(int i=0;i<n;i++) {
            System.out.println( res[i]);
        }

    }


}
