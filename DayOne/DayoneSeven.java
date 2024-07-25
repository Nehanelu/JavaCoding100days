
 /*----------------------------------------------------------------------------------------------------- 
 07-Write a Program to Find Amstrog of a Number in Java.
 -----------------------------------------------------------------------------------------------------------
 */
import java.util.*;
import java.util.Scanner;
public class DayoneSeven{
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int number = sc.nextInt();
 int t1 = number;
 int leng = 0;
 while(t1 !=0){
    leng = leng+1;
    t1 = t1/10;
 }
 int t2 = number;
 int Amstrog =0;
 while (t2 !=0){
    int mul =1;
    int rem = t2%10;
    for(int i=1; i<leng; i++){
      mul= mul*rem;
    }
    Amstrog = Amstrog+mul;
    t2 =t2/10;
}
if(Amstrog == number){
    System.out.println("the number is amstrong number " +number);
}
else {
    System.out.println("The number is not a amstrong number : "+number);
}
 }
    }

