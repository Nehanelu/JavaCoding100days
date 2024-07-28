/*
 * 02 - Write a Java Program to Find the Largest Element in Array
Input: [ 7, 2, 5, 1, 4]
Output: 7

 */
public class DayFour {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 5, 1, 4};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);
    }
}
