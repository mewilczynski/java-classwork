// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

import java.util.Scanner;
public class Reverse
{
   //-----------------------------------------------------------------
   // Reverses the digits of an integer mathematically.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
     int number;
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter a positive integer: ");
     number = scan.nextInt();
 
     //Call your new method here (or within the output statement below)
     System.out.println("That number reversed is " + reverseint (number) );
   }
   
   public static int reverseint(int number)
   {
      int lastDigit, reverse = 0;
      
        do  {
         lastDigit = number % 10;
         reverse = (reverse * 10) + lastDigit;
         number = number / 10;
            } while (number > 0);
      return reverse;
   }
}
