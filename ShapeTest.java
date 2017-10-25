// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

//The purpose of this program is to 

import java.util.*;

public class ShapeTest
{
   public static void main(String[] args)
   {
      //initialize scanner
      Scanner input = new Scanner(System.in);
      
      //define local variables
      String name;
      long sides;
      
      //define the shape objects
      Shape shape1 = new Shape();
      Shape.Counter();
      Shape shape2 = new Shape();
      Shape.Counter();
      Shape shape3 = new Shape();
      Shape.Counter();
      
      //Populate objects
      System.out.println("Enter information on " + Shape.Count() + " shapes");
      System.out.println("Enter the name of the shape: ");
      name = input.next();
      System.out.println("");
      shape1.setName(name);
      System.out.println("Enter the number of sides: ");
      sides = input.nextLong();
      System.out.println("");
      shape1.setSides(sides);
      
      System.out.println("Enter the name of the shape: ");
      name = input.next();
      System.out.println("");
      shape2.setName(name);
      System.out.println("Enter the number of sides: ");
      sides = input.nextLong();
      System.out.println("");
      shape2.setSides(sides);
      
      System.out.println("Enter the name of the shape: ");
      name = input.next();
      System.out.println("");
      shape3.setName(name);
      System.out.println("Enter the number of sides: ");
      sides = input.nextLong();
      System.out.println("");
      shape3.setSides(sides);
      
      System.out.println("Here is the info you entered for the " + Shape.Count() + " shapes: ");
      System.out.println(shape1);
      System.out.println(shape2);
      System.out.println(shape3);

      
   }
}   