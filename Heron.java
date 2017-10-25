// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

// The goal of this program is to calculate the area of a triangle
// using Heron's theorem.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Heron
{
   public static void main(String[] args)
   {
   //Declare variables
   double side1, side2, side3, area, s;
   
   //Set up input
   Scanner input = new Scanner(System.in);
   
   //Prompt user for sides
   System.out.println("Enter the length of side 1: ");
   side1 = input.nextDouble();
   System.out.println("Enter the length of side 2: ");
   side2 = input.nextDouble();
   System.out.println("Enter the length of side 3: ");
   side3 = input.nextDouble();
   
   //Calculate S
   s = ((side1 + side2 + side3)/2);
   
   //Calculate area
   area = Math.sqrt((s*(s - side1)*(s - side2)*(s - side3)));
   
   //Format output
   DecimalFormat fmt = new DecimalFormat ("0.###");
   
   //Output calculation
   System.out.println("The area is: " + fmt.format(area));
   

   }
}