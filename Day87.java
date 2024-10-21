
import java.util.HashSet;
import java.util.Set;

class Day87 {
    public int maxUniqueSplit(String s) {
        return backtrack(s, 0, new HashSet<>());
    }
    
    private int backtrack(String s, int start, Set<String> used) {
        if (start == s.length()) {
            return 0;
        }
        
        int maxCount = 0;
        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (!used.contains(substring)) {
                used.add(substring);
                maxCount = Math.max(maxCount, 1 + backtrack(s, end, used));
                used.remove(substring);
            }
        }
        
        return maxCount;
    }
}
