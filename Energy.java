// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

import java.util.Scanner;

//This program calculates the amount of energy needed to change the water
//temperature between two temperaturs given by the user.

public class Energy
{
   public static void main(String[] args)
   {
   
      //Declare constants
      final int SHC = 4184;
      
      //Declare variables
      float mass, initialTemp, finalTemp, energy;
      
      //Set up input
      Scanner input = new Scanner(System.in);
      
      //Prompt user for input
      System.out.println("Enter the amount of water in kilograms: ");
      mass = input.nextFloat();
      
      System.out.println("Enter the initial temperature in degrees Celsius: ");
      initialTemp = input.nextFloat();
      
      System.out.println("Enter the final temperature in degrees Celsius: ");
      finalTemp = input.nextFloat();
      
      //Calculate the energy using Q = M * (fT - iT) * Cp
      energy = (mass * (finalTemp - initialTemp) * SHC);
      
      //Display the results
      System.out.println("The energy needed is " + energy + " joules.");
   }
}