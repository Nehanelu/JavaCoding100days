public class Day11 {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int firstTerm = 0;
            int secondTerm = 1;
            int thirdTerm = 1;
            for (int i = 3; i <= n; i++) {
                int fourthTerm = firstTerm + secondTerm + thirdTerm;
                firstTerm = secondTerm;
                secondTerm = thirdTerm;
                thirdTerm = fourthTerm;
            }
            return thirdTerm;  // Return the last computed term, which is the N-th Tribonacci number
        }
    }


      public static void main(String[] args) {
        Day11 day11 = new Day11();
        int n = 10;  // Example value for n
        System.out.println("Tribonacci number at position " + n + " is " + day11.tribonacci(n));
    }
}
