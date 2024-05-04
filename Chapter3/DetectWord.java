package Chapter3;

import java.util.Scanner;

public class DetectWord {
    public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;

      userString = scnr.next();

      /* Your solution goes here  */
      if (userString.equals("Quit")) {
         System.out.println("Goodbye");
      }
      else {
         System.out.println("Hello");  
      }
      scnr.close();
   }
}
