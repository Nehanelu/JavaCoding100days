
import java.util.HashMap;

class Day81  {
    static int subArraySum(int arr[], int tar) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int currentSum = 0;
        int count = 0;
        prefixSumMap.put(0, 1);
        for (int num : arr) {
            currentSum += num;
            if (prefixSumMap.containsKey(currentSum - tar)) {
                count += prefixSumMap.get(currentSum - tar);
            }
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}
