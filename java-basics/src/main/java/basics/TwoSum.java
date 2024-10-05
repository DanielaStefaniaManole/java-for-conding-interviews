package basics;
import java.util.*;

public class TwoSum {
    public static int[] getPair(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<numbers.length; i++) {
            if(map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]), i};
            } 

            map.put(numbers[i], i);
        }

        return new int[] {};
     }
     
     public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 2, 5};
        int[] result = getPair(numbers, 3);

        System.out.println(result[0]);
        System.out.println(result[1]);
     }
}
