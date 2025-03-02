public class count {

    public static int count(int num) {
        int count=0;
        while(num>0) {

            num=num/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(count(890));

    }

}

