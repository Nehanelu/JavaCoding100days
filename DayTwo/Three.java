
/*
  Write a Java Program to Print Pattern.
* * * * * * 
*         * 
*         * 
*         *
*         *
* * * * * *
 */
public class Three {
    public static void main(String args[]){
        // Loop from 0 to 5 (inclusive)
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                // Print "*" if it's the border of the rectangle
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else {
                    // Print space if it's inside the rectangle
                    System.out.print("  ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
