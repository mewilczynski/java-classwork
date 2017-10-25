// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

//The purpose of this program is to change and see the information on Mr. Smith's vehicles.

import java.util.*;

public class CarTest
{
   public static void main(String[] args)
   {
      //initialize scanner
      Scanner input = new Scanner(System.in);
      
      //define the car objects
      Car car1 = new Car(2015, "Ford", "Taurus");
      Car car2 = new Car(2007, "Honda", "Accord");
      Car car3 = new Car();
      
      //define variables
      String make;
      String model;
      long year;
      
      //Begin narrative and output known information on Mr. Smith's vehicles.
      System.out.println("Here is the information I have on Mr. Smith's three cars: ");
      System.out.println(car1);
      System.out.println(car2);
      System.out.println(car3);
      
      //populate the object without information
      System.out.println("Whoops! It seems we do not have the info on one of his cars!");
      System.out.println("Enter the information for the third car here: ");
      
      System.out.println("Make: ");
      make = input.next();
      System.out.println("");
      
      System.out.println("Model: ");
      model = input.next();
      System.out.println("");

      System.out.println("Year: ");
      year = input.nextLong();
      System.out.println("");
      
      //use this information to redefine car3
      car3.setMake(make);
      car3.setModel(model);
      car3.setYear(year);
      
      //Let's change some information!
      System.out.println("Mr. Smith traded the " + car1.getModel() + " for another " + car1.getMake() + " from the same year.");
      System.out.println("Enter the new " + car1.getMake() + " model: ");
      model = input.next();
      car1.setModel(model);
      
      System.out.println("Mr. Smith sold the " + car2.getYear() + " " + car2.getModel() + " to buy a more current version.");
      System.out.println("Enter the new year for the " + car2.getModel() + ": ");
      year = input.nextLong();
      car2.setYear(year);
      
      System.out.println("Here is the updated information I now have on Mr. Smith's three cars: ");
      System.out.println(car1);
      System.out.println(car2);
      System.out.println(car3);      
      
   }
}