package Chapter3;

import java.util.Scanner;

public class BranchingBoolean {
    public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      boolean isRed;
      boolean isBalloon;

      isRed = scnr.nextBoolean();
      isBalloon = scnr.nextBoolean();

      /* Your solution goes here  */
      if (isBalloon == true) {
         
         if (isRed == false) {
            System.out.println("Balloon");
         }
         else {
            System.out.println("Red balloon");  
         }
      }
      else {
         System.out.println("Not a balloon");  
      }
      scnr.close();

   }
}
