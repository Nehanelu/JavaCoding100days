public class DaySix {
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // In case d > n
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    // Helper function to reverse elements of the array
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        
        System.out.println("Original Array:");
        printArray(arr);
        
        rotateArray(arr, d);
        
        System.out.println("Rotated Array:");
        printArray(arr);
    }
}
