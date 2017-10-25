// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

import java.util.Scanner;
import java.text.NumberFormat;

// This program is meant to print the prime numbers
// between 2 and a number given by the user.

public class Prime
{
   public static void main(String[] args)
   {
   
   //Declare variables
   final int PER_LINE = 10;
   int num1, num2, count;
   String answer;
   
   //Initialize variable count
   count = 0;
   
   //Set up input
   Scanner input = new Scanner(System.in);
   

   //Calculate prime number and print using a for loop
      do
      {  //Prompt user for number
         System.out.println("Enter a number greater than 2: ");
         num1 = input.nextInt();
   
         //Input validation
         while (num1 <= 2)
         {
            System.out.println("Enter another number greater than 2: ");
            num1 = input.nextInt();
         }
         
         for (num2 = 2; num2 <= num1; num2++)
         {  
            //Print the prime numbers used to calculate the prime numbers further down.
            if (num2 == 2 || num2 == 3 || num2 == 5 || num2 == 7 || num2 == 11 || num2 == 13)
               {
               System.out.print(num2 + " ");
               count++;
               } 
                 //Check whether numbers at 17 or higher under our range are prime.
                 //If they are divisible by these numbers, they are not prime and are skipped.
            else if (num2 % 2 == 0  || num2 % 3 == 0 || num2 % 5 == 0 || num2 % 7 == 0 || num2 % 11 == 0 || num2 % 13 == 0)
               {
               continue;
               }
            else  //If a number is prime, print said number
               {
               System.out.print(num2 + " ");
               count++;
               }
            //Print a line when count is evenly divisible by ten, meaning that there are ten numbers on each line.    
            if (count % PER_LINE == 0)
               System.out.println();
         } //Prompt user to see if they would like to calculate more prime numbers.     
       System.out.println();
       System.out.println("Would you like to continue?");
       System.out.println("Enter yes or no: ");
       answer = input.next(); 
       count = 0;
       }while (answer.equalsIgnoreCase("yes")); //continue the do loop if user says yes
   
   }
   
}