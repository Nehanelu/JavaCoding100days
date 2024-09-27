import java.util.ArrayList;
import java.util.List;

class MyCalendarTwo {
    List<int[]> events;
    List<int[]> overlaps;

    public MyCalendarTwo() {
        events = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] overlap : overlaps) {
            if (start < overlap[1] && end > overlap[0]) {
                return false;  
            }
        }

        for (int[] event : events) {
            if (start < event[1] && end > event[0]) {
                int overlapStart = Math.max(start, event[0]);
                int overlapEnd = Math.min(end, event[1]);
                overlaps.add(new int[]{overlapStart, overlapEnd});
            }
        }

        events.add(new int[]{start, end});
        return true;
    }
}
