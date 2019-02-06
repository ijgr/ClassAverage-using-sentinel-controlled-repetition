// ClassAverage.java
// Solving the class average problem using sentinel controlled repetition. 
import java.util.Scanner; // program uses class Scanner

public class ClassAverage 
{
   public static void main(String[] args)
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      // initialization phase
      int total = 0; // initialize sum of grades
      int gradeCounter = 0; // initialize # of grades entered so far
     
      System.out.print("Enter grade or -1 to quit: "); 
      int grade = input.nextInt(); 

      // loop until sentinel value read from user
      while (grade != -1) 
      {
         total = total + grade; // add grade to total
         gradeCounter = gradeCounter + 1; // increment counter 

         
         System.out.print("Enter grade or -1 to quit: "); 
         grade = input.nextInt(); 
      }

      // if user entered at least one grade...
      if (gradeCounter != 0) 
      {
         // use number with decimal point to calculate average of grades
         double average = (double) total / gradeCounter;  

         // display total and average (with two digits of precision)
         System.out.printf("%nTotal of the %d grades entered is %d%n", 
            gradeCounter, total);
         System.out.printf("Class average is %.2f%n", average); 
      } 
      else // no grades were entered, so output appropriate message
         System.out.println("No grades were entered"); 
   } 
} // end class 