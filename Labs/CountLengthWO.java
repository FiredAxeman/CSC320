package Labs;

import java.util.Scanner;

public class CountLengthWO {
     public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
      int i;
      int count;
      int mistakes;
      mistakes = 0;
      count = 0;
      userText = scnr.nextLine();
      scnr.close();
      for (i = 0; i < userText.length(); i++) {
         if(userText.charAt(i) == ' ') {
            count++;
            mistakes++;
         }
         else if(userText.charAt(i) == ',') {
            count++;
            mistakes++;
         }
         else if(userText.charAt(i) == '.') {
            count++;
            mistakes++;
         }
         else {
            count++;
         }
      }
      System.out.println(count - mistakes);
      
   }
}
