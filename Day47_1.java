public class Day47_1 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;  // Count how many multiples of 5
            count += n;
        }
        return count;
    }
}
