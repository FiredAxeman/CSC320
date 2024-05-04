package Labs;

import java.util.Scanner;

public class PaintEstimator {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallHeight;
      double wallWidth;
      double wallArea;
      final double paint = 350.00;
      
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      System.out.println("Enter wall width (feet):");
      wallWidth = scnr.nextDouble();
      wallArea = (wallHeight * wallWidth);
      System.out.println("Wall area: " + wallArea + " square feet");
      System.out.println("Paint needed: " + (wallArea / paint) + " gallons");
      System.out.println("Cans needed: " + (int)Math.round(wallArea/paint) + " can(s)");
      scnr.close();
      // FIXME (1): Prompt user to input wall's width
      // Calculate and output wall area
      // FIXME (1): Calculate the wall's area
      // FIXME (1): Finish the output statement
      // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
      // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
   }
}
