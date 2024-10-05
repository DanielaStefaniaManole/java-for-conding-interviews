package basics;
import java.util.*;

public class ContainsDuplicate {
    public static boolean solve(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                return true;
                }
            }
        }
        
        return false;
    }

    public static boolean solveUsingMap(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<numbers.length; i++) {
            if(map.containsKey(numbers[i])) {
                return true;
            } 

            map.put(numbers[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 2, 1};
        System.out.println(solve(numbers));
        System.out.println(solveUsingMap(numbers));
    }
}
