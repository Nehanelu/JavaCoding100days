import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Daythree {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 5};
        int[] result = removeDuplicates(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int value : array) {
            set.add(value);
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int value : set) {
            result[index++] = value;
        }
        
        return result;
    }
}
