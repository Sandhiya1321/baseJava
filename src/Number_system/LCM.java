package Number_system;

public class LCM {
        public static void main(String[] args) {
            int n1=100;
            int n2=50;
            int hcf=0;
            int lcm=0;
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
            lcm=(n1*n2)/hcf;
            System.out.println(lcm);
        }

    }
