public class Day74 {

    public int minSwaps(String s) {
        int balance = 0; // To track the current balance of brackets
        int maxImbalance = 0; // To track the maximum imbalance
        for (char c : s.toCharArray()) {
            if (c == '[') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                maxImbalance = Math.max(maxImbalance, -balance);
            }
        }

        return (maxImbalance + 1) / 2;
    }
}
