package Chapter3;

import java.util.Scanner;

public class CheckPasscode {
    public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      boolean hasDigit;
      String passCode;

      hasDigit = false;
      passCode = scnr.next();
      scnr.close();
      if (Character.isDigit(passCode.charAt(0))) {
         hasDigit = true;
      }
      if (Character.isDigit(passCode.charAt(1))) {
         hasDigit = true;
      }
      if (Character.isDigit(passCode.charAt(2))) {
         hasDigit = true;
      }
      if (hasDigit) {
         System.out.println("Has a digit.");
      }
      else {
         System.out.println("Has no digit.");
      }
   }
}
