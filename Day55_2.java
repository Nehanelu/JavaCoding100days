public class Day55_2 {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;
        int[] kmpTable = buildKMPTable(combined);
        int longestPalindromePrefix = kmpTable[kmpTable.length - 1];
        return rev.substring(0, rev.length() - longestPalindromePrefix) + s;
    }
    private int[] buildKMPTable(String str) {
        int n = str.length();
        int[] kmpTable = new int[n];
        int j = 0;
        
        for (int i = 1; i < n; i++) {
            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = kmpTable[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)) {
                j++;
            }
            kmpTable[i] = j;
        }
        
        return kmpTable;
    }
}
