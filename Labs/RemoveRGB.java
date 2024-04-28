package Labs;

import java.util.Scanner;

public class RemoveRGB {
    public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int userInput1;
      int userInput2;
      int userInput3;
      userInput1 = scnr.nextInt();
      userInput2 = scnr.nextInt();
      userInput3 = scnr.nextInt();
      if ((userInput1 < userInput2) && (userInput1 < userInput3)) {
         userInput2 = userInput2 - userInput1;
         userInput3 = userInput3 - userInput1;
         userInput1 = 0;
         System.out.println(userInput1 + " " + userInput2 + " " + userInput3);
      }
      else if ((userInput2 < userInput1) && (userInput2 < userInput3)) {
         userInput1 = userInput1 - userInput2;
         userInput3 = userInput3 - userInput2;
         userInput2 = 0;
         System.out.println(userInput1 + " " + userInput2 + " " + userInput3);
      }
      else if ((userInput3 < userInput2) && (userInput3 < userInput1)) {
         userInput1 = userInput1 - userInput3;
         userInput2 = userInput2 - userInput2;
         userInput3 = 0;
         System.out.println(userInput1 + " " + userInput2 + " " + userInput3);
      }
      else if ((userInput1 == 255) && (userInput2 == 255) && (userInput3 == 255)) {
         userInput1 = 0;
         userInput2 = 0;
         userInput3 = 0;
         System.out.println(userInput1 + " " + userInput2 + " " + userInput3);
      }
      else if ((userInput1 == 0) && (userInput2 == 0) && (userInput3 == 0)) {
         System.out.println(userInput1 + " " + userInput2 + " " + userInput3);
      }
      
   }
}
