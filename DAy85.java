public class DAy85 {
    public char findKthBit(int n, int k) {
        if (n == 1) {
            return '0';
        }
        
        int length = (1 << n) - 1;  // (1 << n) is the same as 2^n
        int middle = length / 2 + 1;
        if (k < middle) {
            return findKthBit(n - 1, k);
        }
        if (k == middle) {
            return '1';
        }
        int mirrorIndex = length - k + 1;
        char mirrorBit = findKthBit(n - 1, mirrorIndex);
        return mirrorBit == '0' ? '1' : '0';
    }
}
