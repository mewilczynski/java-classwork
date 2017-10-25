// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

import java.util.Scanner;

//This program gives the Chinese Zodiac for the year given by the user.

public class Fusion
{
   public static void main(String[] args)
   {
   
   //Set up our variables
   String gem1, gem2;
   
   //Set up input
   Scanner input = new Scanner(System.in);   
   
   //Prompt user for gems/humans
   System.out.println("Please enter a gem or human from Steven Universe: ");
   gem1 = input.next();
   System.out.println("Please enter another gem or human from Steven Universe: ");
   gem2 = input.next();
   
   //Calculate fusions
   if (gem1.equalsIgnoreCase("pearl"))
      if(gem2.equalsIgnoreCase("garnet"))
         System.out.println("When " + gem1 + " and " + gem2 + " fuse, their fusion is Sardonyx.");
      else if(gem2.equalsIgnoreCase("amethyst"))
         System.out.println("When" + gem1 + " and " + gem2 + " fuse, their fusion is Opal.");
      else if(gem2.equalsIgnoreCase("rose"))
         System.out.println("When " + gem1 + " and " + gem2 + " fuse, their fusion is Rainbow Quartz.");
      else
         System.out.println("There is no known fusion for this pair.");
         
      if (gem1.equalsIgnoreCase("amethyst"))
         if(gem2.equalsIgnoreCase("garnet"))
            System.out.println("When " + gem1 + " and " + gem2 + " fuse, their fusion is Sugilite.");
         else if(gem2.equalsIgnoreCase("steven"))
            System.out.println("When " + gem1 + " and " + gem2 + " fuse, their fusion is Smoky Quartz.");
         else if(gem2.equalsIgnoreCase("pearl"))
            System.out.println("When " + gem1 + " and " + gem2 + " fuse, their fusion is Opal .");
         else
            System.out.println("There is no known fusion for this pair.");
            
      if (gem1.equalsIgnoreCase("garnet"))
         if(gem2.equalsIgnoreCase("amethyst"))
            System.out.println("When " + gem1 + " and " + gem2 + " fuse, their fusion is Sugilite.");
         else if(gem2.equalsIgnoreCase("pearl"))
            System.out.println("When " + gem1 + " and " + gem2 + " fuse, their fusion is Sardonyx.");
         else
            System.out.println("There is no known fusion for this pair.");
            
      if (gem1.equalsIgnoreCase("steven"))
         if(gem2.equalsIgnoreCase("connie"))
            System.out.println("When " + gem1 + " and " + gem2 + " fuse, their fusion is Stevonnie.");
         else if(gem2.equalsIgnoreCase("amethyst"))
            System.out.println("When " + gem1 + " and " + gem2 + " fuse, their fusion is Smoky Quartz.");
         else
            System.out.println("There is no known fusion for this pair.");
            
      if (gem1.equalsIgnoreCase("connie"))
         if(gem2.equalsIgnoreCase("steven"))
            System.out.println("When " + gem1 + " and " + gem2 + " fuse, their fusion is Stevonnie.");
         else
            System.out.println("There is no known fusion for this pair.");
            
      if (gem1.equalsIgnoreCase("rose"))
         if(gem2.equalsIgnoreCase("pearl"))
            System.out.println("When " + gem1 + " and " + gem2 + " fuse, their fusion is Rainbow Quartz.");
         else
            System.out.println("There is no known fusion for this pair.");
   }
   
}