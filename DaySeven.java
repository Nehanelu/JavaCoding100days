import java.util.Arrays;

public class DaySeven {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 5, 1};
        int key = 1;
        int[] result = removeElement(array, key);
        System.out.println("Final result: " + Arrays.toString(result));
    }
    
    public static int[] removeElement(int[] array, int key) {
        int count = 0;
        for (int num : array) {
            if (num == key) {
                count++;
            }
        }
        
        // Create new array with reduced size
        int[] newArray = new int[array.length - count];
        int index = 0;
        
        // Copy elements except the key to the new array
        for (int num : array) {
            if (num != key) {
                newArray[index++] = num;
            }
        }
        
        return newArray;
    }
}
