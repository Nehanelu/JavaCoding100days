public class Day20_2 {
    

    public int myAtoi(String s) {
        int index = 0, sign = 1, total = 0;
        int n = s.length();

        // 1. Remove Whitespaces
        while (index < n && s.charAt(index) == ' ')
            index++;

        // 2. Check if optional sign exists
        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }

        // 3. Convert the digits to a number
        while (index < n) {
            char ch = s.charAt(index);
            if (ch < '0' || ch > '9') break; // Stop if not a digit
            
            int digit = ch - '0';

            // 4. Check for overflow before multiplying and adding
            if (total > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;
        }

        return total * sign;
    }
}
