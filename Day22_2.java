public class Day22_2 {
    
    public int myAtoi(String s) {
        int index = 0, n = s.length();
        int sign = 1;
        int result = 0;
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }
        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }
        while (index < n) {
            char currentChar = s.charAt(index);
            if (currentChar < '0' || currentChar > '9') {
                break; 
            }
            
            int digit = currentChar - '0';
            
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }
    
        return result * sign;
    }
}
