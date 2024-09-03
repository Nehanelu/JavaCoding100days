import java.util.ArrayList;
import java.util.List;
public class Day39_1 {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, s, 0, "", 0);
        return result;
    }
    
    private void backtrack(List<String> result, String s, int start, String currentIp, int segment) {
        if (segment == 4 && start == s.length()) {
            result.add(currentIp.substring(0, currentIp.length() - 1)); // Remove the last dot
            return;
        }
        if (segment == 4 || start == s.length()) {
            return;
        }
        
        for (int length = 1; length <= 3; length++) {
            if (start + length > s.length()) break;
            String part = s.substring(start, start + length);
            if (isValid(part)) {
                backtrack(result, s, start + length, currentIp + part + ".", segment + 1);
            }
        }
    }
    
    private boolean isValid(String part) {
        if (part.length() > 1 && part.startsWith("0")) return false; // No leading zero
        int num = Integer.parseInt(part);
        return num >= 0 && num <= 255;
    }
}

