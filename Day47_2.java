
import java.util.HashMap;

class Day47_2  {
    public String fractionToDecimal(int numerator, int denominator) {
        // Handle cases where numerator is 0
        if (numerator == 0) return "0";
        
        StringBuilder result = new StringBuilder();
        
        // Determine if the result is negative
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }
        
        // Convert to long to avoid overflow issues with INT_MIN / -1
        long num = Math.abs((long) numerator);
        long denom = Math.abs((long) denominator);
        
        // Append the integer part
        result.append(num / denom);
        long remainder = num % denom;
        
        // If there is no remainder, we are done
        if (remainder == 0) {
            return result.toString();
        }
        
        // There is a fractional part, so append the decimal point
        result.append(".");
        
        // Map to store remainder positions to detect repeating decimals
        HashMap<Long, Integer> map = new HashMap<>();
        
        while (remainder != 0) {
            // If the remainder is already in the map, we found a repeating cycle
            if (map.containsKey(remainder)) {
                result.insert(map.get(remainder), "(");
                result.append(")");
                break;
            }
            
            // Record the position of the remainder
            map.put(remainder, result.length());
            
            remainder *= 10;
            result.append(remainder / denom);
            remainder %= denom;
        }
        
        return result.toString();
    }
}
