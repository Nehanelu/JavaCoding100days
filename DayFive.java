
/*
01-  Write a Java Program to Compute the Sum of Array Elements.
Input: [ 2, 4, 6, 7, 9]
Output: 28
*/
public class DayFive {
    public static void main(String[] args) {
    
        int[] array = {2, 4, 6, 7, 9};

    
        int sum = 0;

    
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("The sum of array elements is: " + sum);
    }
}
