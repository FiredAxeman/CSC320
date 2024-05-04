package Labs;

import java.util.Scanner;

public class MabLibLoops {
      public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int looper;
      looper = 1;
      while (looper != 0) {
         String userInput = scnr.next();
         int userNum = scnr.nextInt();
         if (userInput.equals("quit")) {
            break;
         }
         scnr.close();
         System.out.println("Eating " + userNum + " " + userInput + " a day keeps you happy and healthy.");
      }
   }
}
