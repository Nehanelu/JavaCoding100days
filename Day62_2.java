public class Day62_2 {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int maxLength = 0; 
        for (int num1 : arr1) {
            String str1 = Integer.toString(num1); 
            for (int num2 : arr2) {
                String str2 = Integer.toString(num2); 
                int commonLength = getCommonPrefixLength(str1, str2);
                maxLength = Math.max(maxLength, commonLength);
            }
        }
        
        return maxLength;
    }
    private int getCommonPrefixLength(String str1, String str2) {
        int i = 0;
        int minLength = Math.min(str1.length(), str2.length());
        while (i < minLength && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        
        return i; 
    }
}
