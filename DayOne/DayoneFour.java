
 /*------------------------------------------------------------------------------------------------------------
  04- Write a Java Program to convert Integer numbers and Binary numbers.
 ----------------------------------------------------------------------------------------------------------------
*/
 public class DayoneFour { // Class declaration shuru hoti hai

    public static void main(String[] args) { // main method shuru hoti hai
        int number = 29; // Ek example number ko initialize karte hain
        System.out.println("Binary representation of " + number + " is: " + toBinary(number)); // Result print karte hain
    }

    public static String toBinary(int number) { // toBinary method ka declaration
        String binary = ""; // Ek empty string to store binary representation

        if (number == 0) { // Check if the number is 0
            return "0"; // Agar number 0 hai to directly "0" return karte hain
        }

        while (number > 0) { // Jab tak number 0 se bada hai, loop chalta rahega
            binary = (number % 2) + binary; // Number ko 2 se divide karke remainder ko binary string ke aage prepend karte hain
            number = number / 2; // Number ko 2 se divide kar ke quotient ko number mein assign karte hain
        }

        return binary; // Final binary string return karte hain
    }
}
