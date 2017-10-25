// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

import java.util.Scanner;
import java.text.NumberFormat; 

// This program calculates the retail price of an item from the 
// wholesale price and markup given by the user.

public class RetailCalculator
{
   public static void main(String[] args)
   {
   
   //Declare variables
   double perc, wPrice;
   
   //Set up scanner
   Scanner input = new Scanner(System.in);
   
         
   //Set up currency format
   NumberFormat moneyFmt = NumberFormat.getCurrencyInstance();   

   //Prompt user for percentage
   System.out.println("Please enter a percentage(in %): ");
   perc = input.nextDouble();
   perc = (perc/100); 
   
      // Input validation
      while (perc < 0 || perc > 1)
      {
      System.out.println("Please enter another percentage: ");
      perc = input.nextDouble();
      perc = (perc/100);
      }

   System.out.println("Please enter the wholesale price: ");
   wPrice = input.nextDouble();
      
      // Input validation
      while (wPrice < 0)
      {
      System.out.println("Please enter a wholesale price greater than 0: ");
      wPrice = input.nextDouble();
      }
   
   //Call pricecalc method and output the retail price.
   System.out.println("The item's retail price (at a " + perc*100 + "% markup) is: " 
                        + moneyFmt.format(pricecalc (perc, wPrice)));
   
   }
   
   // Define the method that will calculate the retail price
   public static double pricecalc(double perc, double wPrice)
   {
      double rPrice;
      rPrice = 0;

      //Calculate retail price 
      rPrice = ((perc*wPrice) + wPrice);
      return rPrice;
   }
}
   