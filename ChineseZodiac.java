// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

import java.util.Scanner;

//This program gives the Chinese Zodiac for the year given by the user.

public class ChineseZodiac
{
   public static void main(String[] args)
   {
   
      //Set up variables
      int year, remainder;
   
      //Set up input
      Scanner input = new Scanner(System.in);
   
      //Prompt user for year
      System.out.println("Please enter a year: ");
      year = input.nextInt();
   
      //Calculate remainder
      remainder = year % 12;
   
      //Determine Zodiac using remainder via switch
      switch(remainder)
      {
         case(0):
            System.out.println("The year " + year + " is the year of the Monkey.");
            break;  
         case(1):
            System.out.println("The year " + year + " is the year of the Rooster.");
            break;           
         case(2):
            System.out.println("The year " + year + " is the year of the Dog.");
            break; 
         case(3):
            System.out.println("The year " + year + " is the year of the Pig.");
            break; 
         case(4):
            System.out.println("The year " + year + " is the year of the Rat.");
            break; 
         case(5):
            System.out.println("The year " + year + " is the year of the Ox.");
            break; 
         case(6):
            System.out.println("The year " + year + " is the year of the Tiger.");
            break; 
         case(7):
            System.out.println("The year " + year + " is the year of the Rabbit.");
            break; 
         case(8):
            System.out.println("The year " + year + " is the year of the Dragon.");
            break; 
         case(9):
            System.out.println("The year " + year + " is the year of the Snake.");
            break; 
         case(10):
            System.out.println("The year " + year + " is the year of the Horse.");
            break; 
         case(11):
            System.out.println("The year " + year + " is the year of the Sheep.");
            break; 
       }
      
   }
}