package Labs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      while (true) {
         String userText = scnr.nextLine();
         String lowerText = userText.toLowerCase();
         int left = 0;
         int right = userText.length() -1;
         if(lowerText.charAt(left) != lowerText.charAt(right)) {
            System.out.println(userText + " is not a palindrome");
            break;
         }
         if(lowerText.charAt(left) == lowerText.charAt(right)) {
            
            if(right == 0) {
               System.out.println(userText + " is a palindrome");
               break;
            }
         }
         left++;
         right--;
      }
   }
}
