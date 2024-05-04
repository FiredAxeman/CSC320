package Chapter3;

import java.util.Scanner;

public class UsingBoolean {
     public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      boolean isTeenager;
      int kidAge;

      kidAge = scnr.nextInt();

      /* Your solution goes here  */
      isTeenager = (kidAge <= 19) && (kidAge >= 13);

      if (isTeenager) {
         System.out.println("Teen");
      }
      else {
         System.out.println("Not teen");
      }
      scnr.close();
   }
}
