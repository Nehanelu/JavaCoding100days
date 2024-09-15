
import java.util.HashMap;
import java.util.Map;

class Day51_1  {
    private Map<String, Boolean> memo = new HashMap<>();
    
    public boolean isScramble(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return isScrambleHelper(s1, s2);
    }
    
    private boolean isScrambleHelper(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        
        if (s1.length() != s2.length() || !areAnagrams(s1, s2)) {
            return false;
        }
        
        String key = s1 + "," + s2;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        int n = s1.length();
        for (int i = 1; i < n; i++) {
            if ((isScrambleHelper(s1.substring(0, i), s2.substring(0, i)) &&
                 isScrambleHelper(s1.substring(i), s2.substring(i))) ||
                (isScrambleHelper(s1.substring(0, i), s2.substring(n - i)) &&
                 isScrambleHelper(s1.substring(i), s2.substring(0, n - i)))) {
                memo.put(key, true);
                return true;
            }
        }
        
        memo.put(key, false);
        return false;
    }
    
    private boolean areAnagrams(String s1, String s2) {
        int[] count = new int[26];
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}
