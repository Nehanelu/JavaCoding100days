
import java.util.*;

class  Day77 {
    public int smallestChair(int[][] times, int targetFriend) {
        List<int[]> events = new ArrayList<>();
        
        for (int i = 0; i < times.length; i++) {
            events.add(new int[] {times[i][0], i, 1});  
                        events.add(new int[] {times[i][1], i, 0});
        }
        
        Collections.sort(events, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[2] - b[2]; 
        });

        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < times.length; i++) {
            availableChairs.add(i);
        }

        int[] friendChair = new int[times.length];

        for (int[] event : events) {
            int time = event[0];
            int friend = event[1];
            int type = event[2]; 

            if (type == 1) { 
                int chair = availableChairs.poll();
                friendChair[friend] = chair;
                
                if (friend == targetFriend) {
                    return chair;
                }
            } else { 
                availableChairs.add(friendChair[friend]);
            }
        }

        return -1; 
    }
}
