public class Day94 {
    
    public boolean findTriplet(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
    for (int i = 2; i < n; i++) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == arr[i]) {
                    return true;  
                } else if (sum < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;  
    }
}
