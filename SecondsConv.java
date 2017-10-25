// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

import java.util.Scanner;

//This program takes the user's amount of seconds and calculates how
//many hours, minutes, and seconds would be in the original input of seconds,
//then outputs these values.

public class SecondsConv
{
   public static void main(String[] args)
   {
      //Declare constants 
      final int SECS_IN_MIN = 60;
      final int MIN_IN_HOUR = 60;
      
      //Declare variables
      long secs, mins, hours;
      
      //Set up input
      Scanner input = new Scanner(System.in);
      
      //Prompt user for input
      System.out.println("Enter the number of seconds:");
      secs = input.nextLong();
      
      //Calculate minutes and hours
      mins = secs/(SECS_IN_MIN);
      hours = mins/(MIN_IN_HOUR);
      
      //Display results
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + (mins % MIN_IN_HOUR));
      System.out.println("Seconds: " + (secs % SECS_IN_MIN));
   }
   
}