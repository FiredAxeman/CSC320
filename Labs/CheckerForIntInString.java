package Labs;

import java.util.Scanner;

public class CheckerForIntInString {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;
      // Add more variables as needed
      boolean isInteger;
      isInteger = true;
      userString = scnr.next();
      scnr.close();
      int i;
      for (i = 0; i < userString.length(); i++) {
         char x = userString.charAt(i);
         if(Character.isDigit(x)) {
            isInteger = true;
         }
         else {
            isInteger = false;
            break;
         }
      }
      System.out.println(isInteger ? "yes" : "no");
   }
}
