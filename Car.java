// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

public class Car
{
   //Initialize variables for the object
   private String carmake;
   private String carmodel;
   private long caryear;
   
   //This sets up the car by defining its make, model, and year.
   public Car(long year, String make, String model)   
   {
      carmake = make;
      carmodel = model;
      caryear = year;
   }
   
   //This second constructor allows user input.
   public Car()
   {
      carmake = "-";
      carmodel = "-";
      caryear = 0;
   }

   //Accessors for each part of the Car object
   
   public String getMake()
   {
      return carmake;
   }

   public String getModel()
   {
      return carmodel;
   }
   
   public long getYear()
   {
      return caryear;
   }
   
   //Mutators for each part of the Car object
   
   public void setMake(String ma)
   {
      carmake = ma;
   }
   
   public void setModel(String mo)
   {
      carmodel = mo;
   }
   
   public void setYear(long y)
   {
      caryear = y;
   }   
   
   //A toString method to output the object's information.
   public String toString()
   {
      return (caryear + "\t" + carmake + "\t" + carmodel);
   }
}