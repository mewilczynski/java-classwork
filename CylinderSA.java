// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

import java.util.Scanner;

// This program calculates the surface area of a cylinder
// using parameters given by the user.

public class CylinderSA
{
   public static void main(String[] args)
   {
   
   //Declare variables
   double radius, height;
   
   //Set up scanner
   Scanner input = new Scanner(System.in);

   //Prompt user for radius
   System.out.println("Please enter a radius: ");
   radius = input.nextDouble();
   
      // Input validation
      while (radius < 0)
      {
      System.out.println("Please enter a radius greater than 0: ");
      radius = input.nextDouble();
      }

   //Prompt user for height
   System.out.println("Please enter the height: ");
   height = input.nextDouble();
      
      // Input validation
      while (height < 0)
      {
      System.out.println("Please enter a height greater than 0: ");
      height = input.nextDouble();
      }
   
   //Call surfacecalc method and output the surface area of the cylinder.
   System.out.println("The surface area of the cylinder is: " + surfacecalc (radius, height) );
   
   }
   
   // Define the method that will calculate the surface area
   public static double surfacecalc(double radius, double height)
   {
      double surfaceA;
      surfaceA = 0;

      //Calculate the surface area
      surfaceA = ((2 * (Math.PI) * radius * height) + (2 * (Math.PI) * (Math.pow(radius, 2))));
      return surfaceA;
   }
}
   