package Arrays;

import java.util.Arrays;

public class remDupArr {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 5};
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            //o/p=12,3,5
            //if(array[i]!=array[i+1])--o/p=1,2,3,4,5
            if(array[i]==array[i+1]){
                System.out.println(array[i]);
            }
        }
    }
}
