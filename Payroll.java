// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

// The goal of this program is to calculate the gross pay 
// and net pay of a worker and how much pay is deducted by taxes.

import java.util.Scanner;
import java.text.NumberFormat;

public class Payroll
{
   public static void main(String[] args)
   {
   
   //Declare variables
   double hPay, nPay, gPay, sTax, fTax, hoursW;
   String name;
   
   //Set up input
   Scanner input = new Scanner(System.in);
   
   //Set up format
   NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
   NumberFormat fmt2 = NumberFormat.getPercentInstance();
   
   //Prompt user for information
   System.out.println("Please enter employee's name: ");
   name = input.nextLine();
   System.out.println("Please enter amount of hours worked this week: ");
   hoursW = input.nextDouble();
   System.out.println("Please enter amount paid per hour: ");
   hPay = input.nextDouble();
   System.out.println("Please enter federal tax withholding rate (as decimal): ");
   fTax = input.nextDouble();
   System.out.println("Please enter state tax withholding rate (as decimal): ");
   sTax = input.nextDouble();
   System.out.println();
   
   // Calculate net pay and gross pay
   gPay = (hoursW*hPay);
   nPay = (gPay - ((gPay*fTax) + (gPay*sTax)));
   
   //Output the information
   System.out.println("Employee name: " + name);
   System.out.println("Hours worked: " + hoursW);
   System.out.println("Pay rate: " + fmt1.format(hPay));
   System.out.println();
   System.out.println("Gross pay: " + fmt1.format(gPay));
   System.out.println("Deductions: ");
   
   //Calculate and output relative tax deductions
   System.out.println("\tFederal Tax @" + fmt2.format(fTax) + ": " 
                              + fmt1.format(gPay*fTax));
   System.out.println("\tState Tax @" + fmt2.format(sTax) + ": " 
                              + fmt1.format(gPay*sTax));
   System.out.println("\tTotal Deduction: " + fmt1.format(gPay*fTax 
                              + gPay*sTax));
   System.out.println("\tNet Pay: " + fmt1.format(nPay));
   }
}