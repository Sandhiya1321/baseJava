package Number_system;

public class HCF {
    public static void main(String[] args) {
        int n1=10;
        int n2=20;
        int hcf=0;
        int min=n1<n2?n1:n2;
        while(min>2){
            if(n1%min==0&&n2%min==0){
                hcf=min;
                break;
            }
            else {
                min--;
            }
        }

        System.out.println(hcf);
    }

}
