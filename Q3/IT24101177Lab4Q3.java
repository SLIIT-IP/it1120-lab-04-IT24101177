import java.util.Scanner;

public class IT24101177Lab4Q3{

       public static void main(String[]args){

    Scanner input=new Scanner(System.in);

   int number;
   String message;       

  System.out.print("Enter a number :");
  number=input.nextInt();                     //using ternary operator
 
  message=(number>0) ? "The number is: Positive" :(0>number) ? "The number is:Negative": "The number is:Zero" ; 
 System.out.print(message);
   }
}