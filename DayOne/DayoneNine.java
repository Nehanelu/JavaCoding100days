
 /*--------------------------------------------------------------------------------------------------------------- 
// 09- Write a Program to Find Sum of Fibonacci Series Number
 ------------------------------------------------------------------------------------------------------------------
*/
 import java.util.*;
import java.util.Scanner;
public class DayoneNine {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int a=0;
    int b=1;
    int c;
    for(int i=1; i<=number; i++){
      c= a+b;
      System.out.println("The value of c is  : "+c);
      a=b;
      b=c;
    }    
    }
}