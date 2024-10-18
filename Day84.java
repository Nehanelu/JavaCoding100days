public class Day84 {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;  
        }

        int count = 0;
        int n = nums.length;
         for (int mask = 1; mask < (1 << n); mask++) {
            int subsetOr = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {  
                    subsetOr |= nums[i];
                }
            }
            if (subsetOr == maxOr) {
                count++;
            }
        }

        return count;
    }
}
