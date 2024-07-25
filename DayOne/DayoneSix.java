
 /*---------------------------------------------------------------------------------------------------------
 06-Write a Java Program to Add two Complex Numbers.
 ---------------------------------------------------------------------------------------------------------
*/
 class Complex{
    int real;
    int img;
    public Complex(){}//Defaukt constructor
    public Complex(int r ,int i){
        real =r;
        img =i;
    }
    public void show(){
        System.out.println("the number are: "+real+ "+" +img+ "i");
    }
    public void sum (Complex o1, Complex o2){
        real = o1.real +o2.real;
        img = o1.img  + o2.img;
    }
 }  
 
 
 public class DayoneSix {
    public static void main (String args[]){
  Complex c1 = new Complex(3,5);
  c1.show();
  Complex c2 = new Complex(4,2);
  c2.show();
  Complex c3 = new Complex();
  c3.sum(c1, c2);
  c3.show();
    }
 }*/