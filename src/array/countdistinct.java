package array;

public class countdistinct {
        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 4, 4,5};
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                boolean distinct = true;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        distinct = false;
                        break;
                    }
                }

                if (distinct) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }