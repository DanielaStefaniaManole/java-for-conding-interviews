package basics;
import java.util.*;

public class RansomNote {
    public static boolean check(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) {
            return false;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();
        for(char c: magazine.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for(char c: ransomNote.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) - 1);
            if(charCountMap.get(c) < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("abcc", "cabc"));
        System.out.println(check("abcd", "abcdd"));
        System.out.println(check("abcd", "abc"));
     }
}
