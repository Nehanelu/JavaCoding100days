
import java.util.*;

class Day78 {
    public int minGroups(int[][] intervals) {
        List<int[]> events = new ArrayList<>();
        
        for (int[] interval : intervals) {
            events.add(new int[] {interval[0], 1}); 
            events.add(new int[] {interval[1] + 1, -1}); 
        }
        
        Collections.sort(events, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        
        int maxGroups = 0, currentGroups = 0;
        
        for (int[] event : events) {
            currentGroups += event[1]; 
            maxGroups = Math.max(maxGroups, currentGroups); 
        }
        
        return maxGroups;
    }
}
