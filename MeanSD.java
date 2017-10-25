// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

import java.util.Scanner;

//The purpose of this program is to calculate the average and standard deviation
//of ten values given by the user.

public class MeanSD
{
   public static void main(String[] args)
   {
      //Set up scanner
      Scanner input = new Scanner(System.in);
      
      //declare arrays
      double[] list = new double[10]; 
      
      //prompt user for values
      System.out.println("Please enter ten values: ");
      
      //populate array with user's values
      int i = 0;
      while (i < list.length)
      {
         list[i] = input.nextDouble();
         i++;
      }
      
      //print calculated average and standard deviation using defined methods
      System.out.println("The average is " + mean(list));
      System.out.println("The standard deviation is " + standev(list));
   
   }
   
   //Define the method that will calculate the average and return its value.
   public static double mean(double[] array)
   {
      double sum = 0;
      for (int i = 0; i < array.length; i++)
      {
         sum += array[i];
      }
      return sum / array.length;
   }
   
   //Define the method that will calculate the standard deviation and return its value.
   public static double standev(double[] array)
   {
      double sum = 0;
      double total = 0;
      for (int i = 0; i < array.length; i++)
      {
         sum += Math.pow((array[i] - mean(array)), 2);
      }
      total = Math.sqrt((sum / (array.length - 1)));
      return total;
   }
}   
