import java.util.Scanner;

public class peak1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size n=");
        int n = scan.nextInt();
        int arr[] = new int[n];


        for (int i = 0; i < n; i++) {

            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);
        }
        int peak = arr[0];
        if (n == 1) {
            System.out.println(arr[0]);
            System.exit(0);
        }
        for (int i = 0; i < n; i++) {

            if (i == 0) {

                if (arr[i + 1] >arr[i]) {
                    peak = arr[i+1];

                }}
            else if (i == n - 1) {
                if (arr[i - 1] < arr[i]) {
                    peak = arr[i];
                } }
            else {
                if (arr[i - 1] < arr[i] && arr[i+1] < arr[i ]) {
                    peak = arr[i];
                }
            }

        }
        System.out.println("the peak is  " + peak);


    }}