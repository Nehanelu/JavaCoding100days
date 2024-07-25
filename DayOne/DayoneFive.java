
 

 /*-------------------------------------------------------------------------------------------------------
  05- Write a Program to Find Factorial of a Number in Java.
 --------------------------------------------------------------------------------------------------------
 */import java.util.*;
 import java.util.Scanner;
 public class DayoneFive{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial =1;
        for(int i=1;  i<=number; i++){
            factorial = factorial *i;
        }
        System.out.println("The factorial number is " +factorial);

    }
 }
 