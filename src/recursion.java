public class recursion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //function calling its own function is called recursion
        naturalno(5);

    }
    public static void naturalno(int num){
        //base case
        if(num==1) {
            System.out.println(1);
        }
        //recursive case
        else{
            System.out.println(num);
            naturalno(num-1);
        }
    }
}
