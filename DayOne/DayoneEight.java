 /* --------------------------------------------------------------------------------------------------
 08- Write a Program to Calculate Simple Interest in Java
 --------------------------------------------------------------------------------------------------
 */
 import java.util.*;
 import java.util.Scanner;
 public class DayoneEight{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int p = sc.nextInt();
int r = sc.nextInt();
int t = sc.nextInt();
int Simple_intrest = (p*r*t)/100 ;
System .out.println ("the value of p : " +p);
System.out.println("the value of  R is  : "+r);
System.out.println("The value of t is  : " +t);
System.out.println("the value of Simple Intrest is  " +Simple_intrest);

}}