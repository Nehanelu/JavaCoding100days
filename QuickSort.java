
public class QuickSort {

    // Function to partition the array on the basis of pivot element
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];  // Choosing the last element as pivot
        int i = (low - 1);      // Index of smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Function to perform QuickSort
    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // Partition the array around pivot and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to print the array
    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function to run the program
    public static void main(String args[]) {
        QuickSort qs = new QuickSort();
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array:");
        qs.printArray(arr);

        qs.quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        qs.printArray(arr);
    }
}
