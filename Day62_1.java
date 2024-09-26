public class Day62_1 {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int maxLength = 0;
         for (int num1 : arr1) {
            String s1 = Integer.toString(num1);
            for (int num2 : arr2) {
                String s2 = Integer.toString(num2);
                int commonPrefixLength = getCommonPrefixLength(s1, s2);
                maxLength = Math.max(maxLength, commonPrefixLength);
            }
        }

        return maxLength;
    }
      private int getCommonPrefixLength(String s1, String s2) {
        int i = 0;
        int minLength = Math.min(s1.length(), s2.length());
        while (i < minLength && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }
        
        return i; 
    }
}
