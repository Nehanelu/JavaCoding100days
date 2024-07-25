/*-------------------------------------------------------------------------------------------------------------
 // 10-Write a Program to leap year in Java.
 ------------------------------------------------------------------------------------------------------------------
  */
  import java.util.*;
  import java.util.Scanner;

  public class DayoneTen
  {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        if ((year%400 == 0 )||(year%4 ==0 && year%100 != 0) )
        {
            System.out.println("The givan year is a leap year :" +year);
        }
        else {
            System.out.println("The Given year is not a leap year");
        }

    }
  }
  