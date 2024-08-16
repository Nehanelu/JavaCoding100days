
import java.util.*;

class Day22_1 {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        int n = nums.length;
        
        // Step 2: Iterate over the array with two nested loops
        for (int i = 0; i < n - 3; i++) {
            // Avoid duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            for (int j = i + 1; j < n - 2; j++) {
                // Avoid duplicates for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                // Two-pointer approach for the remaining two numbers
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Move the left pointer to the next different number
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        // Move the right pointer to the previous different number
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++; // We need a larger sum, move left pointer to the right
                    } else {
                        right--; // We need a smaller sum, move right pointer to the left
                    }
                }
            }
        }
        
        return result;
    }
}
