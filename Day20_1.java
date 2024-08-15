public class Day20_1 {
    
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10; // extract the last digit
            x /= 10; // remove the last digit from x
            
            // Check for overflow before updating reversed
            if (reversed > Integer.MAX_VALUE / 10 || 
                (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || 
                (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            
            reversed = reversed * 10 + digit; // build the reversed number
        }
        return reversed;
    }
}
