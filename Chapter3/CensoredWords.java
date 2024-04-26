package Chapter3;

import java.util.Scanner;

public class CensoredWords {
      public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput;

      userInput = scnr.nextLine();
      int index = userInput.indexOf("darn");
      if (index == -1) {
         System.out.println(userInput); 
      }
      else {
         System.out.println("Censored");  
      }

   }
}
