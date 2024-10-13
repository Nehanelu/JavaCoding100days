
import java.util.*;

class DAy79  {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int value = nums.get(i).get(0);
            minHeap.offer(new int[] {value, i, 0});
            max = Math.max(max, value);
        }

        int rangeStart = 0, rangeEnd = Integer.MAX_VALUE;

        while (minHeap.size() == nums.size()) {
            int[] current = minHeap.poll();
            int min = current[0];  
            int row = current[1];  
            int col = current[2];  

            if (max - min < rangeEnd - rangeStart || (max - min == rangeEnd - rangeStart && min < rangeStart)) {
                rangeStart = min;
                rangeEnd = max;
            }
        if (col + 1 < nums.get(row).size()) {
                int nextValue = nums.get(row).get(col + 1);
                minHeap.offer(new int[] {nextValue, row, col + 1});
                max = Math.max(max, nextValue); 
            }
        }
     return new int[] {rangeStart, rangeEnd};
    }
}
