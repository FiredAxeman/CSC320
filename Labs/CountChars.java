package Labs;

import java.util.Scanner;

public class CountChars {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
  
      while (true) {
        
        String text = scanner.nextLine();
  
        if (text.equalsIgnoreCase("quit") || text.equalsIgnoreCase("q")) {
          break;
        }
  
        // Preprocess text to consider only alphanumeric characters (ignore case)
        String processedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
  
        if (isPalindrome(processedText)) {
          System.out.println(text + " is a palindrome");
        } else {
          System.out.println(text + " is not a palindrome");
        }
      }
  
      scanner.close();
    }
  
    public static boolean isPalindrome(String text) {
      int left = 0;
      int right = text.length() - 1;
  
      while (left < right) {
        if (text.charAt(left) != text.charAt(right)) {
          return false;
        }
        left++;
        right--;
      }
  
      return true;
    }
}
