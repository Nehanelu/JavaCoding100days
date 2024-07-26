/*
 * Write a Program to Print Pyramid Number Pattern in Java.
    *
   ***
  *****
 *******
 */
public class Two {
    public static void main(String args[]){
        int rows = 4;  // Number of rows in the pattern
        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

