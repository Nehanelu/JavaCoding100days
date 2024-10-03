
import java.util.HashMap;

class DAy69_1 {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int targetRemainder = (int) (totalSum % p);
        if (targetRemainder == 0) {
            return 0;
        }
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); 
        
        int result = n; 
        long prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            int currentRemainder = (int) (prefixSum % p);
            int requiredRemainder = (currentRemainder - targetRemainder + p) % p;
            if (remainderMap.containsKey(requiredRemainder)) {
                int subarrayLength = i - remainderMap.get(requiredRemainder);
                result = Math.min(result, subarrayLength);
            }
            remainderMap.put(currentRemainder, i);
        }
        return result == n ? -1 : result;
    }
}
