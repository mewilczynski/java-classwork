// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

// The goal of this program is to create a username for the user by
// taking the first letter of the user's first name, the first three 
// letters of the user's last name, and a random number between 10 and 99,
// and combining all three.

import java.util.Scanner;
import java.util.Random;


public class Usernames

{
   public static void main(String[] args)
   {
   //Declare variables
   String fName, lName, username;
   
   //Set up input
   Scanner input = new Scanner(System.in);
   
   //Prompt user for first and last name
   System.out.println("Enter your first name: ");
   fName = input.nextLine();
   System.out.println("Enter your last name: ");
   lName = input.nextLine();
   
   //Create username
   Random generator = new Random();
   username = fName.charAt(0) + lName.substring(0, 3) 
      + (generator.nextInt(89) + 10);
    
   // Output username
   System.out.print("Username: " + username);
   }
   
}
   