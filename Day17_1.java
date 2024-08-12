public class Day17_1 {

    public String reverseWords(String s) {
        // Step 1: Trim the string to remove leading and trailing spaces
        s = s.trim();
        
        // Step 2: Split the string by one or more spaces using regex
        String[] words = s.split("\\s+");
        
        // Step 3: Reverse the order of words
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        
        // Step 4: Join the words with a single space
        return String.join(" ", words);
    }

    // Main method to test the reverseWords function
    public static void main(String[] args) {
        Day17_1 day17_1 = new Day17_1();
        
        // Test cases
        String s1 = "the sky is blue";
        System.out.println(day17_1.reverseWords(s1)); // Output: "blue is sky the"

        String s2 = "  hello world  ";
        System.out.println(day17_1.reverseWords(s2)); // Output: "world hello"

        String s3 = "a good   example";
        System.out.println(day17_1.reverseWords(s3)); // Output: "example good a"
    }
}
