package Labs;

import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userInput;
      char userChar;
      userChar = scnr.next().charAt(0);
      userInput = scnr.nextLine();
      int count;
      int i;
      count = 0;
      scnr.close();
      for (i = 0; i < userInput.length(); i++) {
         if (userInput.charAt(i) == userChar) {
            count++;
         }
      }
      System.out.println(count);
      
   }
}
