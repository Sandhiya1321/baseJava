package array;

import java.util.*;

public class elementsMoreThanNbyKtimes {
    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 8, 9, 6, 6, 6, 6, 3, 3, 3};
        int k = 4;
        System.out.println( count(arr, k));
    }

    public static List<Integer> count(int[] arr, int k) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > n / k) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
