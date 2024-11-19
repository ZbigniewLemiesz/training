package longest_substrng;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zbigniew Lemiesz
 */

public class Solution {
    //Time Complexity - O(n2)
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int current = 0;
        Set<Character> subs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.length() - i <= result) break;
            for (int j = i; j < s.length(); j++) {
                Character c = (Character) s.charAt(j);
                if (subs.add(c)) {
                    current++;
                    if (j == s.length() - 1 && current > result) result = current;
                } else {
                    if (current > result) result = current;
                    current = 0;
                    subs.clear();
                    break;
                }
            }
        }
        return result;
    }
}