public class Day66_1 {
   int[] stack;
    int size;
    int maxSize;
 public Day66_1(int maxSize) {
        this.stack = new int[maxSize];
        this.size = 0; 
        this.maxSize = maxSize;
    }
    public void push(int x) {
        if (size < maxSize) {
            stack[size] = x; 
            size++;          
        }
    }
    public int pop() {
        if (size == 0) {
            return -1; 
        size--; 
        return stack[size]; 
    }
    public void increment(int k, int val) {
        int limit = Math.min(k, size); 
        for (int i = 0; i < limit; i++) {
            stack[i] += val; 
        }
    }
}

