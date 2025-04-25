package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class sortfreq {
    public static void main(String[] args) {
        int[] arr = {4, 4, 6, 7, 4, 6, 5};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int[] sortedArray = new int[arr.length];
        AtomicInteger index = new AtomicInteger();
        frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> {
                    for (int i = 0; i < entry.getValue(); i++) {
                        sortedArray[index.getAndIncrement()] = entry.getKey();
                    }
                });

        System.out.println(Arrays.toString(sortedArray));
    }
}