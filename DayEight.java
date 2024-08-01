public class DayEight {
    public static void main(String[] args) {
        String input = "racecar";
        
        
        input = input.toLowerCase();
        boolean isPalindrome = true;
        int length = input.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
