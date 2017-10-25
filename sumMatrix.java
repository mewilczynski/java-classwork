// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

import java.util.Scanner;

// The purpose of this program is to add two 3x3 matrices,
// filled with values given by the user, together, and output the sum.

public class sumMatrix
{
   public static void main(String[] args)
   {
      //set up scanner
      Scanner input = new Scanner(System.in);
      
      //declare arrays and variables
      double[][] matrix1 = new double [3][3]; 
      double[][] matrix2 = new double [3][3]; 
      double[][] matrix3 = new double [3][3]; 
      int i, j;
      
      //prompt user for input      
      System.out.println("Enter matrix 1:");
      
      //using two for loops, one nested, populate array 1.
      for(i = 0; i < 3; i++)
      {
         for(j = 0; j < 3; j++)
         {
            matrix1[i][j] = input.nextDouble();
         }
      }
      
      //prompt user to fill the second array
      System.out.println("Enter matrix 2: ");
      
      ////using two for loops, one nested, populate array 2.
      for(i = 0; i < 3; i++)
      {
         for(j = 0; j < 3; j++)
         {
            matrix2[i][j] = input.nextDouble();
         }
      }
      
      System.out.println("The addition of the matrices is: ");
      
      //using two for loops again, we print the values within the array
      for(i = 0; i < 3; i++)
      {
         for(j = 0; j < 3; j++)
         {
            if( j % 3 == 0)
               System.out.println("");
               
            System.out.print(matrix1[i][j] + "\t");

         }
      }
      
      System.out.println("");
      System.out.println("");
      System.out.println("+");
      
      for(i = 0; i < 3; i++)
      {
         for(j = 0; j < 3; j++)
         {
            if( j % 3 == 0)
               System.out.println("");
               
            System.out.print(matrix2[i][j] + "\t");
         }
      }   
      
      //invoke the defined method for matrix addition and assign the sum to a new array
      matrix3 = matsum(matrix1, matrix2);
      
      System.out.println("");
      System.out.println("");
      System.out.println("=");
      
      //print new array using the same nested for loops
      for(i = 0; i < 3; i++)
      {
         for(j = 0; j < 3; j++)
         {
            if( j % 3 == 0)
               System.out.println("");
               
            System.out.print(matrix3[i][j] + "\t");
         }
      }        
   }
   
   //define a method that adds together two matrices. Like the other nested 
   //for loops, this one just adds the two known matrices together to populate
   //a third matrix.
   public static double[][] matsum(double[][] array1, double[][] array2)
   {
      int i, j;
      double[][] array3 = new double [3][3]; 
      for(i = 0; i < 3; i++)
      {
         for(j = 0; j < 3; j++)
         {
            array3[i][j] = array1[i][j] + array2[i][j];
         }
      }   
      return array3;
   }

}