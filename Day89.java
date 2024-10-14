
import java.util.PriorityQueue;

class Day89  {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        for (int num : nums) {
            maxHeap.add(num);
        }
        
        long score = 0;
        
        for (int i = 0; i < k; i++) {
            int largest = maxHeap.poll();
            score += largest;
            int reduced = (int) Math.ceil(largest / 3.0);
            maxHeap.add(reduced);
        }
        
        return score;
    }
}
