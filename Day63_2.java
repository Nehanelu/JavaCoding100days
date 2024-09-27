
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

class  Day63_2{
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
        while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            deque.addLast(i);

            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
            }
        }
        
        return result;
    }
}
