public class Day46_2 {
        public int maximumGap(int[] nums) {
            if (nums.length < 2) return 0;
            int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
            for (int num : nums) {
                minVal = Math.min(minVal, num);
                maxVal = Math.max(maxVal, num);
            }
            int n = nums.length;
            if (minVal == maxVal) return 0; 
            
            int bucketSize = (int) Math.ceil((double) (maxVal - minVal) / (n - 1));
            int bucketCount = (maxVal - minVal) / bucketSize + 1;
            int[][] buckets = new int[bucketCount][2]; 
            for (int i = 0; i < bucketCount; i++) {
                buckets[i][0] = Integer.MAX_VALUE; 
                buckets[i][1] = Integer.MIN_VALUE; 
            }
            for (int num : nums) {
                int index = (num - minVal) / bucketSize;
                buckets[index][0] = Math.min(buckets[index][0], num);
                buckets[index][1] = Math.max(buckets[index][1], num);
            }
            int maxGap = 0, prevMax = minVal;
            for (int[] bucket : buckets) {
                if (bucket[0] == Integer.MAX_VALUE) continue; 
                maxGap = Math.max(maxGap, bucket[0] - prevMax);
                prevMax = bucket[1];
            }
            
            return maxGap;
        }
    }
    
