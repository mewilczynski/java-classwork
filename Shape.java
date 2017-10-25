// I pledge my Honor that I have not cheated, 
// and will not cheat, on this assignment.
// Marta Wilczynski
// 85621341

public class Shape
{
   //Initialize variables for the object
   private String shapename;
   private long numsides;
   static int count;
   
   //set up object
   public Shape()  
   {
      shapename = "-";
      numsides = 0;
   }
   
   //static method for count
   public static void Counter()   
   {
      count++;
   }
   
   public static int Count()
   {
      return count;
   }
   
   //Mutators for each part of the Shape object
   public void setName(String name)
   {
      this.shapename = name;
   }
   
   public void setSides(long sides)
   {
      this.numsides = sides;
   }
 
   //A toString method to output the object's information.
   public String toString()
   {
      return ("Shape: " + shapename
               + "\nNo. of sides: " + numsides);
   }
}