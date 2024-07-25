/*---------------------------------------------------------------------------------------------------------------
  03-Write a Program to Swap Two Numbers
  --------------------------------------------------------------------------------------------------------------
 */
  import java.util.*;
 import java.util.Scanner;

 public class DayoneThree{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      //int a= 10;
      // int b =30;
       System.out.println("the value of a before swapping : " +a);
       System.out.println("the value of b Before swapping : " +b);
       int c =a;
       a=b;
       b=c;
       System.out.println("the value of a after swapping " +a);
       System.out.println("The value of b after swapping  "+b);}}
