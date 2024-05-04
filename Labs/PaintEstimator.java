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
      
   }
}
