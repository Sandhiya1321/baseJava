package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class freqeach {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3};
        Map<Integer,Integer> frequencyMap=new HashMap<>();
        for(int num:arr){
            if(frequencyMap.containsKey(num)){
                frequencyMap.put(num,frequencyMap.get(num)+1);
            }
            else{
                frequencyMap.put(num,1);
            }
        }
        System.out.println("Element\nFrequency");
        for(Map.Entry<Integer,Integer>entry:frequencyMap.entrySet()){
                System.out.println(entry.getKey()+"\t"+entry.getValue());
            }
        }
    }

