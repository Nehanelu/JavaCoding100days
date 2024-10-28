public class day95 {
    
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int maxStreak = -1; 
        for (int num : nums) { 
            int streak = 1; 
            int current = num;
            while (numSet.contains(current * current)) {
                streak++;
                current *= current;
            }
            if (streak > 1) {
                maxStreak = Math.max(maxStreak, streak);
            }
        }
        
        return maxStreak;
    }
}
