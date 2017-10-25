// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

import java.util.Scanner;

// This program writes the lyrics to the song "One Hundred Bottles of Beer."
// depending on the number given by the user.

public class TravelingSong
{
   public static void main(String[] args)
   {
   
   //Set up variables
   int verses;
   
   //Set up input
   Scanner input = new Scanner(System.in);
   
   //Prompt user
   System.out.println("Please enter a number: ");
   verses = input.nextInt();
   
   //Input validation
   while (verses < 0)
   {
      System.out.println("Incorrect value. Please enter a new number: ");
      verses = input.nextInt();
   }
   
   //Use number of verses and a while loop to write the song
   while (verses > 0)
   {
      System.out.println(verses + " bottles of beer on the wall");
      System.out.println();
      System.out.println(verses + " bottles of beer");
      System.out.println();
      System.out.println("If one of those bottles should happen to fall");
      System.out.println();
      System.out.println((verses - 1) + " bottles of beer on the wall");
      System.out.println();
      System.out.println();
      
      verses--;
   }
    
   }
   
}