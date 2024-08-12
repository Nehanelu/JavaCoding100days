public class Day17_2 {
    
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int minLength = Math.min(length1, length2);

        // Merge characters from both strings alternately
        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        // Append remaining characters from the longer string
        if (length1 > minLength) {
            result.append(word1.substring(minLength));
        } else if (length2 > minLength) {
            result.append(word2.substring(minLength));
        }

        return result.toString();
    }

    // Main method to test the mergeAlternately function
    public static void main(String[] args) {
        Day17_2 day17_2 = new Day17_2();
        
        // Test cases
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(day17_2.mergeAlternately(word1, word2)); // Output: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        System.out.println(day17_2.mergeAlternately(word1, word2)); // Output: "apbqrs"

        word1 = "abcd";
        word2 = "pq";
        System.out.println(day17_2.mergeAlternately(word1, word2)); // Output: "apbqcd"
    }
}
