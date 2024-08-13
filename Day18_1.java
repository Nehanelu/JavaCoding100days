import java.util.HashSet;
import java.util.Set;


public class Day18_1 {
    

    public int lengthOfLongestSubstring(String s) {
        // Create a set to store unique characters
        Set<Character> uniqueChars = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        // Iterate over the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If the character at the right pointer is already in the set, move the left pointer
            while (uniqueChars.contains(s.charAt(right))) {
                uniqueChars.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            uniqueChars.add(s.charAt(right));
            // Calculate the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
